db.people.aggregate(
    [
        {$match: {nationality: "Poland", sex: "Female"}},
        {$unwind: {path: "$credit"}},
        {$project: {balance: {$toDouble: "$credit.balance"}, credit: "$credit"}},
        {$group: {_id: "$credit.currency", avgBalance: {$avg: "$balance"}, totalBalance: {$sum: "$balance"}}},
        {$sort: {"avgBalance" : -1}},
        {$out: {db:"nbd", coll:"plwomenbalance"}}
    ])

printjson(db.plwomenbalance.find().toArray())


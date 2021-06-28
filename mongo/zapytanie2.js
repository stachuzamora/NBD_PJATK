db.people.aggregate(
    [
        {$unwind: {path : "$credit"}},
        {$project: { balance: {$toDouble: "$credit.balance"}, credit: "$credit" }},
        {$group: {_id: "$credit.currency", total: {$sum: "$balance"}}},
        {$sort: {"total": -1}},
        {$out: {db: "nbd", coll: "balance"}}])

printjson(db.balance.find().toArray())

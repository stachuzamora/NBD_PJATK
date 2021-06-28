db.people.aggregate(
        [
            { $project: { bmi : {$multiply: [10000, {$divide: ["$weight", {$pow :["$height",2]}]}]}, nationality: "$nationality"}},
            {$group: {_id: "$nationality", minBMI: {$min: "$bmi"}, maxBMI: {$max: "$bmi"}, avgBMI: {$avg: "$bmi"}}}
        ])

printjson(db.bmi.find().toArray())


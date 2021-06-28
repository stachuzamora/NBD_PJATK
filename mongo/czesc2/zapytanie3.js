db.people.aggregate([{$group: {_id: "jobs_set", jobs: {$addToSet: "$job"}}}, {$out: {db: "nbd", coll: "jobs_coll"}}])
printjson(db.jobs_coll.find().toArray())

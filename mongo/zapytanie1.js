
db.people.aggregate(
	[
		{ $group: {
			_id: "$sex",
			avgWeight: {$avg: "$weight"},
			avgHeight: {$avg: "$height"}
			}
		},
		{$out: {
			db: "nbd",
			coll: "avg_coll"
			}
		}
	])



printjson(db.avg_coll.find().toArray())


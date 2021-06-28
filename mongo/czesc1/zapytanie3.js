printjson(db.people.find({nationality: "Germany", sex: "Male"}, {first_name: 1, last_name: 1, _id: 0}).toArray())

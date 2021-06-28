// Used this to extract year of birth and use it for query
/*
db.people.find({birth_date: {$exists: true}}).forEach(function(obj) {
        obj.year_born = parseInt(obj.birth_date.substring(0,4))
        db.people.save(obj);
});
*/

printjson(db.people.find({year_born: {$gte: 2001}}, {first_name: 1, last_name: 1, "location.city": 1, _id: 0, year_born: 1}).toArray())


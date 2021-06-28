// used this one to convert strings to floats

/*
db.people.find({weight: {$exists: true}}).forEach(function(obj) {
        obj.weight = parseFloat(obj.weight);
        db.people.save(obj);
});
*/

printjson( db.people.find({weight : {$gte: 68, $lt: 71.5}}, {first_name: 1, last_name:1, weight: 1, _id:0}).toArray() )

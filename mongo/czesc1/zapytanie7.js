// Used this to convert peoples hight to float

db.people.find({height: {$exists: true}}).forEach(function(obj) {
	obj.height = parseFloat(obj.height)
    db.people.save(obj);
});

printjson( db.people.deleteMany({height: {$gt: 190}}) )


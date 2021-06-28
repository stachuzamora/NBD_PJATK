from riak import RiakClient
import json


def configure_riak_client(port, protocol):
    return RiakClient(pb_port=8098, protocol=protocol)


def main():

    riak_client = configure_riak_client(8098, "http")

    my_bucket = riak_client.bucket("s24071")

    # 1 set property -> add from file to db
    store_doc = my_bucket.new_from_file(
            key="example_doc",
            filename="example_2.json"
            )
    store_doc.store()

    # 2 get property
    returned_doc = my_bucket.get("example_doc").data

    print(f"Returned document from db:\n {returned_doc}\n")

    # 3 modiify it

    returned_doc["quiz"]["sport"]["q1"]["answer"] = "Golden State Warriors"

    # 4 storing it
    updated_doc = my_bucket.new("example_doc", returned_doc)
    updated_doc.store()

    # 5 getting it again
    returned_modified_obj = my_bucket.get("example_doc")
    returned_modified_doc = returned_modified_obj.data
    print(f'Modified one (answer in first question): \n {returned_modified_doc}')
    print()

    # 6 delete it
    returned_modified_obj.delete()

    # 7 try getting it
    print(f'After deletion get example_doc -> {my_bucket.get("example_doc").data}')

if __name__ == "__main__":
    main()

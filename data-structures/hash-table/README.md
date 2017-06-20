//TODO: collisions.

# Hash Table

A hash table (hash map) is a data structure which allows the mapping of keys to
values. A hash table uses a hash function to compute an index into an array of
buckets or slots, from which the desired value can be found. The hashing can be
split into 2 stages. First the hashing function converts the input into an
integer, then the integer is reduced using the modulo operator so that it is in
the interval [0, table.size() - 1]

## Functions Included

###### hash(val)
Our hash function is very simple and can be seen in the source code.

###### put(val)
Takes a hash entry object and inserts it into the map.

###### get(key)
Takes a key (int) and returns the value associated with it.

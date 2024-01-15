class Cache:
    def __init__(self,max_size=5) -> None:
        self.cache={}
        self.order =[] # to keep the track of the items
        self.max_size = max_size

    def get(self,key):
        if key in self.cache:
            #move the accessed key to the end to mark it as most recently used
            self.order.remove(key)
            self.order.append(key)

            return self.cache[key]
        else:
            return None
    
    def put(self,key,value):
        if len(self.cache)>=self.max_size:
            #remove the least recently used item
            oldest_key =self.order.pop(0)
            del self.cache[oldest_key]
        
        self.cache[key]= value
        self.order.append(key)

cache = Cache(max_size=5)

#LRU cache -- Least Recently used is a cache where least recently used items are discarded first when the cache is at its max size

from collection import OrderedDict

class LRU:
    def __init__(self,capacity=5) -> None:
        self.cache =cache
        self.capacity =capacity
    
    def get(self,key):
        if key in self.cache:
            self.cache.move_to_end(key)
            return self.cache[key]
        else:
            return None
    
    def put(self,key,value):
        if len(self.cache)>=self.capacity:
            #cache is full, so remove the LRU item is that is the first item in orderedDict
            self.cache.popitem(last = False)

            self.cache[key]= value
            self.cache.move_to_end(key)

lru =LRU(capacity=5)
    
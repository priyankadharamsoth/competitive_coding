from collections import Counter


s = 'rat'
t = 'cat'

hash_map_s = {}
hash_map_t = {}

for i in s:
    if i not in hash_map_s.items():
        hash_map_s[i] = 1
    else:
        hash_map_s[i] += 1
for i in t:
    if i not in hash_map_t.items():
        hash_map_t[i] = 1
    else:
        hash_map_t[i] += 1

print(hash_map_s == hash_map_t)
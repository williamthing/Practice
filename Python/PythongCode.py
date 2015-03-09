# William Thing
# Practicing Python

# given array is reversed and then printed
def python(my_list):
   for i in range(len(my_list)/2):
      temp = my_list[len(my_list)-1-i]
      my_list[len(my_list)-1-i] = my_list[i]
      my_list[i] = temp
   print my_list

# returns an array with 1's and 0's
# 1 represent odd numbers and 0 represent evens
def remove_odds(my_list):
   new_list = []
   for i in range(len(my_list)):
      new_list.append(0);
   for i in range(len(my_list)):
      if (my_list[i] % 2 != 0):
         new_list[i] = 1;
   return new_list;
   
my_list = [1, 2, 3, 4, 5, 6, 7];
python(my_list);
print my_list;
this_list = remove_odds(my_list);
print this_list;

"""
str = "Hello World"
print "%s %s %s" % (str, str, str)
print my_list
print my_list

min = {x: ord(x) for x in 'spaam'}
print min
"""
max = dict(elephant=1, hi=['hi', 2, 3], ho=2, howdy=3);
print max['hi'][-2]
ks = max.keys()
print ks
ks.sort()
print ks

for key in sorted(max):
   print key, '=>', max[key]

T = (1,)
print T[0]
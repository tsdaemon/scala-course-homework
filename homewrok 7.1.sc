val set = EmptyIntSet include 7 include 1 include 4 include 567

set

val set2 = set map(x => x+1)

set2

val set3 = set2 map (_*2)

val set4 = EmptyIntSet include 7 include 5 include 9 include 12 include 15

val set5 = set4 map { x => if (x > 7) x else -x }

set5 isBalanced



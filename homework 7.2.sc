val list = Cons(2, Cons(3, Nil))

list.head

list.toString()

val list2 = Cons[Int](5, Cons[Int](3, Cons[Int](7, Cons[Int](0, Nil))))

list2.nth(-1)

(list2 nth -1)
(list2 nth -2)
(list2 nth 1)
(list2 nth 0)


list++list2

list concat list2
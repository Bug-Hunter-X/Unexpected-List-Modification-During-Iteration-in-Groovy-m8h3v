# Groovy List Modification During Iteration Bug
This repository demonstrates an uncommon bug in Groovy related to modifying a list while iterating over it using the `each` method.

The bug arises when attempting to remove an element from a list within an `each` loop.  The standard `each` method does not provide a safe way to modify the list during iteration.

The included `bug.groovy` file illustrates this unexpected behavior.  `bugSolution.groovy` provides a corrected version.
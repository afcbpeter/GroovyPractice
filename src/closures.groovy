
(1..10).findAll({ return it%2==0 }).each(){ println "In a closure $it" }
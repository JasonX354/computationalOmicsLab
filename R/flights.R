library(nycflights13)
library(tidyverse)

#2+ hour delays
filter(flights, dep_delay >= 2)
#flew to Houston
filter(flights, dest == 'IAH' | dest == 'HOU')
#operated by United, American, or Delta
filter(flights, carrier == 'DL'| carrier == 'UA' | carrier == 'AA')
#departed by summer
filter(flights, month <= 9 & month >= 7)
#did not leave late, but arrived >2 hours late
filter(flights, dep_delay <= 0 & arr_delay > 2)
#delayed by 1+ hour, made up >30 mid flight
filter(flights, dep_delay >= 1 | arr_delay < .5)
#depart between midnight and 6, inclusive
filter(flights, dep_time <= 1200 & dep_time >= 600)
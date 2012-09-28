## Summary

Template Scala Web project ready to be deployed to Heroku.

## Setup

* Launch [SBT](https://github.com/harrah/xsbt/):

    ./sbt

* (optionally) generate IDEA configuration:

    gen-idea

* Start Jetty server so that it boots the server after any source change:

    ~;container:start; container:reload /

* Open [http://localhost:8650/](http://localhost:8650/)

== Heroku instructions

If you already have all the necessary tools from [Heroku](http://heroku.com/) then you only need to

    ./sbt clean compile stage
    heroku login
    heroku create
    git push heroku master
    heroku open

[More on Heroku Scala article](https://devcenter.heroku.com/articles/scala)

Hope you enjoy, don't forget to [follow me on twitter](http://twitter.com/mileskin)!


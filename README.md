Gradle plugin for Spring XD modules
===================================

What is this?
-------------

This is a plugin for creating Spring XD module out of generic Java Gradle projects.

How it works?
-------------

The plugin creates an additional 'buildModule' task, which creates a zip archive
which can be subsequently unzipped and deployed in a Spring XD runtime. 

Only 'compile' dependencies are packaged in the 'lib' folder. 

The resources are packaged in the root of the archive, allowing the developer to provide the required 'config' folder.

What's left to do?
------------------

Plenty. A few ideas:
 
- integrate with the Pivotal 'propdeps' plugin (so that it is invoked automatically)
- treat the configuration files (xml and properties) separately (i.e. they should not be packaged in the target jar)
- make sure that the archive name and the name of the xml/properties file match (right now this is left to the developer)
- write some proper documentation


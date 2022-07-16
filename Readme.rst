|Banner|

|CI Scanner| |CI Build| |Maintainability| |Packages|

|

.. contents:: **Contents**
  :backlinks: none

Installation
============

Package
-------

The latest version of the packages can be found on the GitHub `releases page <https://github.com/abd3lraouf/Semantic/releases>`_.

Root project `build.gradle`
^^^^^^^^^^^^^^^^^^^^^
.. code-block:: groovy

   repositories {
       maven {
           url = uri("https://maven.pkg.github.com/abd3lraouf/Semantic")
       }
   }

App project `build.gradle`
^^^^^^^^^^^^^^^^^^^^^
.. code-block:: groovy

   dependencies {
       implementation("dev.abd3lraouf.learn.Semantic:sdk:<latest-release>")
   }
|Packages|

Contributing
============

|Maintainability|

Thanks to all our contributors! I'm very grateful for all the work you've done to make Open source projects better.

|Contribs|

Copyright
=========

This project is distributed under the Apache license version 2.0 (see the LICENSE file in the project root).

By submitting a pull request to this project, you agree to license your contribution under the Apache license version
2.0 to this project.


.. |Banner| image:: https://github.com/abd3lraouf/Semantic/blob/master/art/automated-semantic-versioning.png
   :target: https://github.com/abd3lraouf/Semantic
   :alt: Semantic logo

.. |CI Scanner| image:: https://github.com/abd3lraouf/Semantic/actions/workflows/code-scanner.yml/badge.svg
   :target: https://github.com/abd3lraouf/Semantic/actions/workflows/code-scanner.yml
   :alt: CI code scanner

.. |CI Build| image:: https://github.com/abd3lraouf/Semantic/actions/workflows/sdk-ci.yml/badge.svg
   :target: https://github.com/abd3lraouf/Semantic/actions/workflows/sdk-ci.yml
   :alt: CI build

.. |Maintainability| image:: https://codeclimate.com/github/abd3lraouf/Semantic/badges/gpa.svg
   :target: https://codeclimate.com/github/abd3lraouf/Semantic
   :alt: Code Climate

.. |Packages| image:: https://img.shields.io/github/v/release/abd3lraouf/Semantic?label=sdk&logo=GitHub
   :target: https://github.com/abd3lraouf/Semantic/packages/1542751
   :alt: sdk

.. |Contribs| image:: https://contrib.rocks/image?repo=abd3lraouf/Semantic
   :target: https://github.com/abd3lraouf/Semantic/graphs/contributors
   :alt: Contributors

## Notes
### Deal with User-defined Packages
- Run this inside package dir
    - Save the file as MyPackageClass.java, and compile it: `javac MyPackageClass.java`
    - Then compile the package: `javac -d . MyPackageClass.java`
- From here one can run from src directory: `java MyPackageClass [args1] [args2] ...`
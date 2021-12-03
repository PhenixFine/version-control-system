# Version Control System
Stage 2 of 4 for JetBrains Academy - Kotlin - [Version Control System project](https://hyperskill.org/projects/177/stages/910/implement).   
This stage has us add the option for the user to update config.txt and index.txt files, for updating the user and files being tracked.
## Requirements
### Description
In this stage, your program should allow a user to set their name and add the files they want to track. Store a username in _config.txt_.

_Index.txt_ stores the files that were added to the index. Don't forget to store all the files of the version control system in the _vcs_ directory. You should create this directory programmatically. It may look something like this:
```text
.
├── vcs
│   ├── config.txt
│   └── index.txt
├── tracked_file.txt
└── untracked_file.txt
```
### Objectives
You need to work on the following commands:  
* `config` should allow the user to set their own name or output an already existing name. If a user wants to set a new name, the program must overwrite the old one.
* `add` should allow the user to set the name of a file that they want to track or output the names of tracked files. If the file does not exist, the program should inform a user that the file does not exist. 

| Do not create tracked_file.txt and untracked_file.txt. This is an example of the files that a user of your version control system will work with. |
| :--- |
### Examples
The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.
#### Example 1: the `config` argument
```text
Please, tell me who you are.
```
#### Example 2: the `config John` argument
```text
The username is John.
```
#### Example 3: the `config` argument
```text
The username is John.
```
#### Example 4: the `config Max` argument
```text
The username is Max.
```
#### Example 5: the `add` argument.
```text
Add a file to the index.
```
#### Example 6: the `add file.txt` arguments
```text
The file 'file.txt' is tracked.
```
#### Example 7: the `add` argument
```text
Tracked files:
file.txt
```
#### Example 8: the `add new_file.txt` argument
```text
The file 'new_file.txt' is tracked.
```
#### Example 9: the `add` argument
```text
Tracked files:
file.txt
new_file.txt
```
#### Example 10: the `add not_exists_file.txt` argument
```text
Can't find 'not_exists_file.txt'.
```
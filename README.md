# Version Control System
Stage 4 of 4 for JetBrains Academy - Kotlin - [Version Control System project](https://hyperskill.org/projects/177/stages/912/implement).   
This stage has us implement the checkout command which allows the user to switch between commits.    
## Requirements
### About
The ability to roll back to the previous versions is crucial for software development. In this project, you will get acquainted with the idea of version control and write a simple version control system.
### Description
In the last stage, implement the `checkout` command. It allows a user to switch between commits and restore the contents of the files according to the current commit.

Get the files you need from the commit directory by the commit id and rewrite the current files.
```text
.
├── vcs
│   ├── commits
│   │   ├── 2853da19f31cfc086cd5c40915253cb28d5eb01c
│   │   │   ├── file1.txt
│   │   │   └── file2.txt
│   │   └── 0b4f05fcd3e1dcc47f58fed4bb189196f99da89a
│   │       ├── file1.txt
│   │       └── file2.txt
│   ├── config.txt
│   ├── index.txt
│   └── log.txt
├── file1.txt
├── file2.txt
└── untracked_file.txt
```
### Objectives
The `checkout` command must be passed to the program together with the commit ID to indicate which commit should be used. If a commit with the given ID exists, the contents of the tracked file should be restored in accordance with this commit. 

| Do not create file1.txt, file2.txt and untracked_file.txt. This is an example of the files that a user of your version control system will work with. |
| :--- |
### Examples
The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.
#### Example 1: the `log` argument
```text
commit 2853da19f31cfc086cd5c40915253cb28d5eb01c
Author: John
Changed several lines of code

commit 0b4f05fcd3e1dcc47f58fed4bb189196f99da89a
Author: John
Added several lines of code
```
#### Example 2: the `checkout 0b4f05fcd3e1dcc47f58fed4bb189196f99da89a` argument
```text
Switched to commit 0b4f05fcd3e1dcc47f58fed4bb189196f99da89a.
```
#### Example 3: the `checkout fb92cc1be7f60c8d9acf74cbd4a67841d8d2e844` argument
```text
Commit does not exist.
```
#### Example 4: the `checkout` argument
```text
Commit id was not passed.
```

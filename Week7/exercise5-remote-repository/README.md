# Exercise 5 - Working with Remote Repository

## Objective

Learn how to connect a local Git repository to a remote GitHub repository using Git commands.

## Commands Used

```bash
git init
echo "# Remote Repository Demo" > README.md
git add README.md
git commit -m "Initial commit"
git remote -v
git remote add origin https://github.com/omkarmm19/DN5.0-Java-FSE-React.git
git remote -v
git push -u origin master
```

## Learning Outcome

- Initialized a local Git repository.
- Created and committed a sample file.
- Added a remote GitHub repository.
- Verified the remote repository configuration.
- Learned the command used to push commits to a remote repository.

## Screenshots

- Output1.png – Git repository initialization.
- Output2.png – Initial commit.
- Output3.png – Viewing remote repositories before adding a remote.
- Output4.png – Remote repository added and verified.
- Output5.png – Push command/output.
# Media Library Management System

A simple Java console application for managing a media library containing songs, movies, podcasts and playlists. This repository contains the source files for the assignment-level Media Library Management System.

## Features
- Add and manage different media items (songs, movies, podcasts).
- Create and manage playlists.
- Rateable media items (where supported).

## Project Files
- `Main.java` : Application entry point (contains `main`).
- `Downloadable.java` : Interface/contract for downloadable items (if implemented).
- `MediaItem.java` : Base class for shared media item fields and behavior.
- `Movie.java` : Movie-specific implementation.
- `PlayList.java` : Playlist implementation.
- `Podcast.java` : Podcast-specific implementation.
- `Rateable.java` : Interface for rateable items.
- `Song.java` : Song-specific implementation.

## Requirements
- Java JDK (11+) installed and `javac`/`java` available on PATH.

## Build & Run (Windows PowerShell)
Open a PowerShell in the project folder (the repository root where this `README.md` sits) and run:

```powershell
# Compile all .java files in the project
javac *.java

# Run the program (replace Main with the actual main class if different)
java Main
```

If compilation produces errors, fix the source files first and re-run `javac`.

## Usage
- The `Main` class runs the console program. Follow on-screen prompts (if implemented) to add media items, create playlists, and rate items.

## Notes
- This is an educational assignment project. Adjust package declarations or folder structure if you convert this into a packaged project.
- If you add packages, compile from the project root using the appropriate `javac` arguments or an IDE.

## Contributing
- For small fixes or improvements, create a branch and submit a pull request.

## License
- This repository does not include an explicit license. Add one if you plan to share or publish this project publicly.

---
Created for the OOP assignment: Media Library Management System.

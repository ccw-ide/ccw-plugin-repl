# ccw-plugin-repl

This Counterclockwise plugin demonstrates how to write user plugins interacting with repls.

This plugin's state is work in progress.

## Install

The `~/.ccw/` folder is where Counterclockwise searches for User Plugins.

It is recommended to layout User Plugins inside this folder by mirroring Github's namespacing. So if you clone ccw-ide/ccw-plugin-repl, you should do the following:

- Create a folder named `~/.ccw/laurentpetit/`
- Clone this project from `~/.ccw/laurentpetit/`

        mkdir -p ~/.ccw/laurentpetit
        cd ~/.ccw/laurentpetit
        git clone https://github.com/laurentpetit/ccw-plugin-repl.git

- If you have already installed ccw-plugin-manager (https://github.com/laurentpetit/ccw-plugin-manager.git), then type `Alt+U S` to re[S]tart User Plugins (and thus ccw-plugin-repl will be found and loaded)
- If you have not already installed ccw-plugin-manager, restart your Eclipse / Counterclockwise/Standalone instance.

## Usage

### nrepl-sniffer.clj

Demonstrates how to react to repl results sent back to ccw by subscribing to the :ccw.repl.response event topic.

### nrepl-spit-port.clj

Adds two listeners to nrepl server launched events.
- `spit-globally` spits the nrepl port to ~/.nrepl file
- `spit-per-project` spits the nrepl port to the corresponding project's folder in an .nrepl file

### react-to-save.clj

Reacts to file saves by sending some command via the active REPL.

### repl-keybindings.clj

Command(s) for working with the REPL

- `reset-components`: Reset Components System by calling (user/reset) via the REPL. Keybinding: `Cmd+U R`


## License

Copyright © 2009-2015 Laurent Petit

Distributed under the Eclipse Public License, the same as Clojure.


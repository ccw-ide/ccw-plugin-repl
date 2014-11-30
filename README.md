# ccw-plugin-repl

This Counterclockwise plugin demonstrates how to write user plugins interacting with repls.

This plugin's state is work in progress.

## Install

The `~/.ccw/` folder is where Counterclockwise searches for User Plugins.

It is recommended to layout User Plugins inside this folder by mirroring Github's namespacing. So if you clone laurentpetit/ccw-plugin-repl, you should do the following:

- Create a folder named `~/.ccw/laurentpetit/`
- Clone this project from `~/.ccw/laurentpetit/`

        mkdir -p ~/.ccw/laurentpetit
        cd ~/.ccw/laurentpetit
        git clone https://github.com/laurentpetit/ccw-plugin-repl.git

- If you have already installed ccw-plugin-manager (https://github.com/laurentpetit/ccw-plugin-manager.git), then type `Alt+U S` to re[S]tart User Plugins (and thus ccw-plugin-repl will be found and loaded)
- If you have not already installed ccw-plugin-manager, restart your Eclipse / Counterclockwise/Standalone instance.

## Usage

[TODO]

## License

Copyright © 2009-2015 Laurent Petit

Distributed under the Eclipse Public License, the same as Clojure.


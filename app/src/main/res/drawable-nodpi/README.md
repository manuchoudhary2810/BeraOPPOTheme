# PNG drop-in paths

Put individual app icons in this folder as transparent PNG files. Use lowercase resource names with underscores, for example:

- `phone.png` for the Phone app
- `messages.png` for Messages
- `settings.png` for Settings

Each icon is connected to its Android app in `../xml/appfilter.xml` by a component mapping. The exact app package/activity names will be added when the target apps are confirmed.

For launcher fallback styling of apps that do not have a dedicated icon, `common.png` is used as the tile background. The app icon is clipped to the centered circle by `../drawable/iconmask.xml`. The fallback mapping is declared in `../xml/appfilter.xml`.

Optional launcher overlay art can be added here with this exact name:

- `iconupon.png` for the foreground overlay

Fallback artwork is interpreted differently by different launchers. PNGs should be square, preferably 512 x 512 pixels; keep foreground artwork centered with transparent padding.
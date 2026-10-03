# Oppo A3 Icon Pack

An Android icon pack using the standard `appfilter.xml` format. It includes PNG artwork and mappings for common OPPO/ColorOS apps, plus several Google app variants. The pack declares theme actions for supported third-party launchers.

## Artwork and mappings

App-specific PNGs are in `app/src/main/res/drawable-nodpi/`; component-to-icon mappings are in `app/src/main/res/xml/appfilter.xml`. Resource filenames must be lowercase and use underscores if needed. Add a mapping with the target app's exact Android package and launcher activity.

The generic `common.png` background and `drawable/iconmask.xml` provide fallback styling where a launcher supports those appfilter entries. Launchers can render fallback art differently.

## Build and apply

The project uses JDK 17 and Android SDK 35. Android Studio is optional, but Gradle and the Android SDK build tools are still required. This checkout does not include a Gradle wrapper; with Gradle installed and the SDK configured, run `gradle :app:assembleDebug` from the project root. The first build may need internet access to download Gradle plugins and Android dependencies.

Install the resulting APK on a device and select it in a launcher that supports icon packs. OPPO/ColorOS stock-launcher support is version-dependent and is not guaranteed; an icon-pack APK cannot add support that the stock launcher does not provide. Testing on the target OPPO device is needed to confirm its launcher behavior.
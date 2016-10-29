android_binary(
  name = 'app',
  manifest = 'app/src/main/AndroidManifest.xml',
  keystore = ':debug_keystore',
  deps = [
    ':activity',
  ],
)

keystore(
  name = 'debug_keystore',
  store = 'myapp/debug.keystore',
  properties = 'myapp/debug.keystore.properties',
)

android_library(
  name = 'activity',
  srcs = glob(['app/src/main/java/demos/drawabledemos/*.java']),
  # final_r_name = 'R',
  deps = [
    ':res',
    ':support-annotations',
    ':appcompat-v7',
    ':design-23',
    ':support-v4',
    ':recyclerview',
    ':animated-vector-drawable',
  ],
  visibility = [ 'PUBLIC' ],
)

android_resource(
  name = 'res',
  res = 'app/src/main/res',
  package = 'demos.drawabledemos',
  deps = [
    ':appcompat-v7',
    ':design-23',
    ':support-v4',
    ':recyclerview',
    ':animated-vector-drawable',
  ],
  visibility = [
    '//:',
  ],
)
android_prebuilt_aar(
  name = 'appcompat-v7',
  aar = 'app/libs/appcompat-v7-23.4.0.aar'
)

android_prebuilt_aar(
  name = 'design-23',
  aar = 'app/libs/design-23.4.0.aar'
)

android_prebuilt_aar(
  name = 'animated-vector-drawable',
  aar = 'app/libs/animated-vector-drawable-23.4.0.aar'
)

android_prebuilt_aar(
  name = 'recyclerview',
  aar = 'app/libs/recyclerview-v7-23.4.0.aar'
)

prebuilt_jar(
  name = 'support-annotations',
  binary_jar = 'app/libs/support-annotations-23.4.0.jar'
)

android_prebuilt_aar(
  name = 'support-v4',
  aar = 'app/libs/support-v4-23.4.0.aar'
)

project_config(
  src_target = ':app',
)

# Editor Saku

Editor kode HTML / CSS / JavaScript untuk HP, dengan hasil langsung, konsol, dan penyimpanan otomatis.
Dibungkus jadi app Android (WebView). Seluruh editor ada di satu berkas: `app/src/main/assets/index.html`.

## Build di GitHub Actions
1. Buat repo GitHub, lalu upload isi zip ini (berkas dan folder langsung di root repo).
2. Buka tab **Actions** -> **Build APK** (jalan otomatis saat push, atau tekan *Run workflow*).
3. Setelah hijau, unduh artifact **EditorSaku-apk**: `app-debug.apk` dan `app-release.apk`. Pasang salah satunya.

Semua build ditandatangani dengan kunci yang sama (`app/editor.keystore`), jadi APK baru bisa dipasang di atas yang lama.

## Mengubah editor
Edit `app/src/main/assets/index.html`, push, dan tunggu build selesai. Nama dan ikon app ada di
`app/src/main/AndroidManifest.xml` dan `app/src/main/res/`.

## Catatan
- Python belum didukung (mesin Pyodide perlu mengunduh berkas tambahan saat berjalan).
- Font Inter dan JetBrains Mono dimuat dari Google Fonts bila ada internet; tanpa internet dipakai font sistem.

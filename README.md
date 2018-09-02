# What is TagMo?

TagMo is an Android app which allows for cloning Amiibos using blank NTAG215 NFC tags. It was created as a result of the "[DIY Amiibo cards](https://gbatemp.net/threads/diy-amiibo-cards.406978/)" thread and all the collaboration that took place in it.

# Features:

* Write dump files from legitimate Amiibos into an NTAG215 tag in a way that WiiU/3DS/switch devices will consider to be a legitimate Amiibo with the same functionality.
* Save data of a tag to a file and restore it to the same or different Amiibo/Clone provided they are of the same character/game/series.
* Beta feature: Edit some parameters of a SSB type amiibo allowing you to change special effects, stats etc.

# Limitations:

* Only NTAG215 tags can be used to clone Amiibos. no other type (eg: NTAG216/NTAG213) are supported.
* You will require the key files used in the Amiibo encryption. Please don't PM me about them as I am unable to share them. The thread linked above may help you find them.
* Once you write an NFC tag, it is effectively permanent.  If we rewrite the NFC tag, it will no longer be recognized as an Amiibo.
* **This means that this method can not replace Amiiqo or other Amiibo emulator devices**
* Only android phones are supported.

# Requirements:
* Amiibo Key Files. (See limitations/Don't ask me for these)
* Some blank NTAG 215 tags (Ebay/Aliexpress)
* Android phone with NFC (Tested on Nexus 5 running Android Lollipop)
* Amiibo dumps or real Amiibos which you can copy. (Don't ask me for these)

# Instructions:

## Cloning Amiibo 
* Install the app on the phone as usual.
* Make sure NFC is enabled.
* If this is the first time you run the app. Use the Menu->Load key(s) file to load the key file(s)
* Use "load tag" to load an amiibo dump file or "scan tag" to scan an Amiibo.
* Use "Write Tag (Auto)" and place the phone over a blank NTAG215 tag to write the data and create a Amiibo out of it.

## Saving Amiibo data to file 
* Click "Scan Tag" to scan the amiibo.
* Click "Save Tag" to save data to a file. (A file name will be generated based on the tag details and saved to the download folder.)

# Editing Super Smash Bros (SSB) data  
* Click "Scan Tag" to scan a amiibo. Make sure that the amiibo was once used in Super Smash Bros before.
* Click "Edit SSB Data" to edit properties related to SSB. Using this on non SSB amiibo will corrupt its saved data. requiring you to restore it from a save file (if you have one) or to reset it. It is recommended you backup the amiibo data using the steps above before trying this out.

# Credits
This app is a result of work by many others. Thanks go out to (In alphabetical order):

* \_Tim\_ - The originial idea
* 1RedOne - support/readme
* azsde - Bug fixes/maintenance
* Bombastisch - support and motivation
* FinalDoom - Bug fixes/maintenance
* H3llK33p3r - Images for browser and main screen.
* javiMaD - Encryption algo help
* Kidel - Bug Fixes
* N3evin - AmiiboAPI data
* North101 - File browser, Extended amiibo info, QR Code, general cleanup
* masterchan-777 - Bug fixes/maintenance
* possi - Wolf link editor
* socram8888 - Decryotion encryption code
* Supercool330 - Encryption algo help
* Others who preferred to remain anonymous.
* Many more who helped in testing.

> Google翻訳によって英語から日本語に翻訳されました。

> Translated from English to Japanese by Google Translate.

# TagMoとは何ですか？

TagMoは空のNTAG215 NFCタグを使用してAmiibosをクローニングできるAndroidアプリです。これは「DIY Amiibo cards（https://gbatemp.net/threads/diy-amiibo-cards.406978/）」スレッドとその中で行われたすべてのコラボレーションの結果として作成されたものです。

# 特徴：

* WiiU / 3DS /スイッチデバイスが同じ機能を持つ正当なAmiiboであると考えられる方法で、正当なAmiibosのダンプファイルをNTAG215タグに書き込む。
* タグのデータをファイルに保存し、同じキャラクター/ゲーム/シリーズのものであれば、同一または異なるAmiibo / クローンに復元することができます。
* ベータ機能：スマブラタイプのAmiiboの一部のパラメータを編集して、特殊効果、統計情報などを変更できます。

# 制限事項：

* AmiibosのクローニングにNTAG215タグのみを使用できます。その他のタイプ（NTAG216 / NTAG213など）はサポートされていません。
* Amiibo暗号化で使用されるキーファイルが必要になります。私がそれらを共有することができないので、彼らについて私にPMをしないでください。上にリンクされたスレッドは、それらを見つけるのに役立ちます。
* NFCタグを書くと効果的に永久的になります。 NFCタグを書き直すと、Amiiboとして認識されなくなります。
* **これはAmiiqoまたは他のAmiiboエミュレータデバイスを置き換えることができないことを意味します**
* アンドロイド携帯電話だけがサポートされています。

# 要件：
* Amiiboキーファイル。 （制限事項を参照/これらについて私に尋ねないでください）
* 一部の空のNTAG 215タグ（Ebay / Aliexpress）
* NFC搭載Android搭載端末（Android Lollipopを搭載したNexus 5でテスト済み）
* あなたがコピーすることができます Amiiboダンプや本物のAmiibos。 （これらは私に尋ねないでください）

# 注意事項：

## クローニングAmiibo
* いつものようにアプリを電話にインストールしてください。
* NFCが有効になっていることを確認してください。
* 初めてアプリを実行する場合。メニュー - >ロードキーファイルを使用して、キーファイルをロードします。
* Amiiboのダンプファイルをロードするには "タグを読み込む"、Amiiboをスキャンするには "タグをスキャン"を使用します。
* "タグに書き込む（自動）"を使用して空のNTAG215タグに電話をかけ、データを書き込んでAmiiboを作成します。

## Amiiboデータをファイルに保存する
* amiiboをスキャンするには、 "Scan Tag"をクリックしてください。
* データをファイルに保存するには、[タグを保存]をクリックします。 （ファイル名はタグの詳細に基づいて生成され、ダウンロードフォルダに保存されます）。

# スーパースマッシュブラザーズ（SSB/スマブラ）データの編集
* amiiboをスキャンするには、 "タグをスキャン"をクリックしてください。 amiiboがかつてスマブラで使用されていたことを確認してください。
*「スマブラデータの編集」をクリックすると、スマブラに関するプロパティを編集できます。非SSB amiiboでこれを使用すると、保存されたデータが破損します。保存ファイル（ある場合）から復元したり、リセットする必要があります。これを試す前に上記の手順を使用してamiiboデータをバックアップすることをお勧めします。

# クレジット
このアプリは多くの人の仕事の結果です。ありがとうございます（アルファベット順）：

* \_Tim\_ - オリジナルのアイデア
* 1RedOne - サポート/ readme
* azsde - バグの修正/メンテナンス
* Bombastisch - サポートとモチベーション
* FinalDoom - バグ修正/メインテナ
* H3llK33p3r - ブラウザとメイン画面の画像。
* HiddenRamblings - オリジナルのgit
* javiMaD - 暗号化アルゴリズムのヘルプ
* Kidel - バグ修正
* N3evin - AmiiboAPIデータ
* North101 - ファイルブラウザ、拡張amiibo情報、QRコード、一般的なクリーンアップ
* masterchan-777 - バグ修正/メンテナンス
* possi - Wolfリンクエディタ
* socram8888 - Decryotion暗号化コード
* Supercool330 - 暗号化アルゴリズムのヘルプ
* 匿名のままにしたい人
* より多くの人がテストに協力しました。

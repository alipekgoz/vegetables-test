# Yeşil Market Sepeti Otomasyonu (Selenium Java)

Bu proje, **Java** ve **Selenium WebDriver** kullanılarak belirli sebzeleri bir e-ticaret sitesinin sepetine otomatik olarak ekleyen basit bir otomasyon testidir.

## Proje Amacı

Temel amacı, bir dizi ürünü (Sebze/Meyve) dinamik olarak listeleyip, önceden tanımlanmış bir "ihtiyaç listesi" ile karşılaştırarak ilgili ürünlerin "Sepete Ekle" butonuna tıklama sürecini otomatikleştirmektir.

Bu, özellikle UI (Kullanıcı Arayüzü) otomasyonunda **birden fazla web elementini döngü içinde işleme** ve **Element Senkronizasyonu** gibi kritik becerileri göstermektedir.

## Kullanılan Teknolojiler

| Teknoloji | Açıklama |
| :--- | :--- |
| **Java** | Otomasyon kodunun yazıldığı ana dil. |
| **Selenium WebDriver** | Tarayıcı etkileşimlerini otomatikleştirmek için kullanılan kütüphane. |
| **Chrome Driver** | Chrome tarayıcısını kontrol etmek için gerekli sürücü. |
| **Maven/Gradle** | (Varsayılan olarak olmasa da, bu tür projeler genellikle bağımlılık yönetimi için kullanır.) |

## Kurulum ve Çalıştırma

### 1. Ön Gereksinimler

* **Java Development Kit (JDK):** Yüklü olmalıdır (Tercihen JDK 8 veya üzeri).
* **IntelliJ IDEA / Eclipse:** Bir Java IDE'si.
* **Maven/Gradle:** Proje bağımlılıklarını yönetmek için (tercihen).
* **ChromeDriver:** Sistem yolunuzda (PATH) veya proje içinde doğru şekilde yapılandırılmış olmalıdır. *(Mevcut kodda bu yol, `System.setProperty` ile belirtilmiştir.)*

### 2. Projeyi Klonlama

```bash
git clone <REPO_ADRESINIZ>
cd <REPO_ADINIZ>

package com.jjk.jjkacademyapi.config;

import com.jjk.jjkacademyapi.model.Clan;
import com.jjk.jjkacademyapi.model.Sorcerer;
import com.jjk.jjkacademyapi.repository.ClanRepository;
import com.jjk.jjkacademyapi.repository.SorcererRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private final SorcererRepository sorcererRepository;
    private final ClanRepository clanRepository;

    @Override
    public void run(String... args) throws Exception {
        Clan zenin = Clan.builder()
                .name("Zenin")
                .description("Klan yang sangat menghargai teknik kutukan yang kuat dan diskriminatif terhadap mereka yang tidak memilikinya. Terkenal dengan teknik warisan Ten Shadows Technique dan Projection Sorcery. Hubungan internal klan ini sangat toxic dan penuh politik kekuasaan.")
                .build();

        Clan gojo = Clan.builder()
                .name("Gojo")
                .description("Salah satu dari tiga klan besar yang diturunkan dari Sugawara no Michizane. Klan ini sangat dominan karena mewarisi teknik terkutuk Limitless dan Gojo Satoru adalah satu-satunya penyihir dalam ratusan tahun yang memiliki Six Eyes sekaligus Limitless.")
                .build();

        Clan kamo = Clan.builder()
                .name("Kamo")
                .description("Klan yang sangat menjunjung tinggi tradisi dan ortodoksitas dalam dunia jujutsu. Mereka memegang kendali besar atas petinggi jujutsu. Teknik warisan utama mereka adalah Blood Manipulation, yang mengontrol darah pengguna untuk berbagai variasi serangan.")
                .build();

        clanRepository.save(zenin);
        clanRepository.save(gojo);
        clanRepository.save(kamo);

        Sorcerer megumi = Sorcerer.builder()
                .name("Megumi Fushiguro")
                .age(17)
                .rank("Grade 1")
                .cursedTechnique("Ten Shadows")
                .clan(zenin)
                .build();

        Sorcerer maki = Sorcerer.builder()
                .name("Maki Zenin")
                .age(18)
                .rank("Grade 1")
                .cursedTechnique("Heavenly Restriction")
                .clan(zenin)
                .build();

        Sorcerer gojoSatoru = Sorcerer.builder()
                .name("Satoru Gojo")
                .age(28)
                .rank("Special Grade")
                .cursedTechnique("Limitless")
                .clan(gojo)
                .build();

        Sorcerer nobara = Sorcerer.builder()
                .name("Nobara Kugisaki")
                .age(17)
                .rank("Special 1")
                .cursedTechnique("Straw Doll Technique")
                .build();
        Sorcerer nanami = Sorcerer.builder()
                .name("Nanami Kento")
                .age(28)
                .rank("Special 1")
                .cursedTechnique("Ratio Technique")
                .build();

        Sorcerer yuta = Sorcerer.builder()
                .name("Okkotsu Yuta")
                .age(18)
                .rank("Special Grade")
                .cursedTechnique("Mimicry / Copy")
                .build();
        Sorcerer yuji = Sorcerer.builder()
                .name("Itadori Yuji")
                .age(17)
                .rank("Grade 1")
                .cursedTechnique("Divergent Fist / Black Flash")
                .build();
        Sorcerer toge = Sorcerer.builder()
                .name("Inumaki Toge")
                .age(18)
                .rank("Grade 1")
                .cursedTechnique("Cursed Speech")
                .build();
        Sorcerer todo = Sorcerer.builder()
                .name("Todo Aoi")
                .age(19)
                .rank("Grade 1")
                .cursedTechnique("Boogie Woogie")
                .build();
        Sorcerer mei = Sorcerer.builder()
                .name("Mei Mei")
                .age(31)
                .rank("Grade 1")
                .cursedTechnique("Black Bird Manipulation")
                .build();
        Sorcerer geto = Sorcerer.builder()
                .name("Suguru Geto")
                .age(18)
                .rank("Special Grade")
                .cursedTechnique("Cursed Spirit Manipulation")
                .build();
        Sorcerer mahito = Sorcerer.builder()
                .name("Mahito")
                .age(0) // Representasi sebagai cursed spirit yang baru lahir
                .rank("Special Grade")
                .cursedTechnique("Idle Transfiguration")
                .build();

        Sorcerer jogo = Sorcerer.builder()
                .name("Jogo")
                .age(100) // Berusia ratusan tahun sebagai kutukan bumi
                .rank("Special Grade")
                .cursedTechnique("Disaster Flames")
                .build();

        Sorcerer hanami = Sorcerer.builder()
                .name("Hanami")
                .age(100)
                .rank("Special Grade")
                .cursedTechnique("Disaster Plants")
                .build();

        Sorcerer choso = Sorcerer.builder()
                .name("Choso")
                .age(150) // Lahir dari rahim terkutuk (Death Painting)
                .rank("Special Grade")
                .cursedTechnique("Blood Manipulation")
                .clan(kamo)
                .build();

        Sorcerer sukuna = Sorcerer.builder()
                .name("Ryomen Sukuna")
                .age(1000) // Raja Kutukan dari era Heian
                .rank("Special Grade")
                .cursedTechnique("Shrine (Cleave and Dismantle)")
                .build();

        Sorcerer panda = Sorcerer.builder()
                .name("Panda")
                .age(16)
                .rank("Semi-Grade 1")
                .cursedTechnique("Abrupt Mutated Cursed Corpse")
                .build();

        Sorcerer kasumi = Sorcerer.builder()
                .name("Kasumi Miwa")
                .age(17)
                .rank("Grade 3")
                .cursedTechnique("New Shadow Style")
                .build();

        Sorcerer noritoshi = Sorcerer.builder()
                .name("Noritoshi Kamo")
                .age(18)
                .rank("Semi-Grade 1")
                .cursedTechnique("Blood Manipulation")
                .clan(kamo)
                .build();

        Sorcerer utahime = Sorcerer.builder()
                .name("Utahime Iori")
                .age(31)
                .rank("Grade 1")
                .cursedTechnique("Solo Solo No Maai")
                .build();

        Sorcerer kusakabe = Sorcerer.builder()
                .name("Atsuya Kusakabe")
                .age(35)
                .rank("Grade 1")
                .cursedTechnique("New Shadow Style (No Innate Technique)")
                .build();

        sorcererRepository.save(megumi);
        sorcererRepository.save(maki);
        sorcererRepository.save(gojoSatoru);
        sorcererRepository.save(nobara);
        sorcererRepository.save(nanami);
        sorcererRepository.save(yuta);
        sorcererRepository.save(yuji);
        sorcererRepository.save(todo);
        sorcererRepository.save(toge);
        sorcererRepository.save(mei);
        sorcererRepository.save(geto);
        sorcererRepository.save(mahito);
        sorcererRepository.save(jogo);
        sorcererRepository.save(sukuna);
        sorcererRepository.save(panda);
        sorcererRepository.save(kasumi);
        sorcererRepository.save(choso);
        sorcererRepository.save(hanami);
        sorcererRepository.save(noritoshi);
        sorcererRepository.save(utahime);
        sorcererRepository.save(kusakabe);
        System.out.println("Initial data Jujutsu Kaisen");
    }
}

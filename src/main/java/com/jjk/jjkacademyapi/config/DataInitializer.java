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

        sorcererRepository.save(megumi);
        sorcererRepository.save(maki);
        sorcererRepository.save(gojoSatoru);
        sorcererRepository.save(nobara);
        sorcererRepository.save(nanami);
        sorcererRepository.save(yuta);
        System.out.println("Initial data Jujutsu Kaisen");
    }
}

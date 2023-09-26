/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.postest1;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class PostTest1 {

    public static void main(String[] args) {
        ArrayList<Anime> animes = new ArrayList<>();
        Anime anime1 = new Anime("Naruto", "action,adventure, vantasi", "pierrot", "masashi kishimoto", 2002, 220, 10);
        Anime anime2 = new Anime("Vinland saga", "adventure, history", "wit studio", "makoto yukimura", 2019, 72, 8);
        Anime anime3 = new Anime("Oshi no ko", "misteri", "doga kobo", "akasaka", 2023, 12, 9);
        Anime anime4 = new Anime("Demon Slayer", "Action, adventure", "uvo table", "koyoharu gotouge", 2019, 55, 9);
        Anime anime5 = new Anime("Jujutsu Kaisen", "supernatural, action", "mappa", "gege akutami", 2020, 47, 8);

        System.out.println("Anime 1:\n" + anime1.toString() + "\n");
        System.out.println("Anime 2:\n" + anime2.toString() + "\n");
        System.out.println("Anime 3:\n" + anime3.toString() + "\n");
        System.out.println("Anime 4:\n" + anime4.toString() + "\n");
        System.out.println("Anime 5:\n" + anime5.toString() + "\n");
    }
}

    

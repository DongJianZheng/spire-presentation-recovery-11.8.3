/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcjn;
import com.spire.presentation.packages.sprdqn;
import com.spire.presentation.packages.sprexo;
import com.spire.presentation.packages.sprfpn;
import com.spire.presentation.packages.sprfsn;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprhnn;
import com.spire.presentation.packages.sprnmp;
import com.spire.presentation.packages.sprpcr;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrpp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvqo;
import com.spire.presentation.packages.sprwin;
import com.spire.presentation.packages.sprwjn;
import com.spire.presentation.packages.sprxsp;
import com.spire.presentation.packages.sprzjh;

@sprtea
public class sprvrn
extends sprfsn {
    private sprwin cfr_renamed_4;

    public static int cfr_renamed_13468(int arg0, sprfzo arg1) {
        return sprnmp.cfr_renamed_13480((float)arg0 * 1024.0f / (float)arg1.cfr_renamed_13317());
    }

    /*
     * WARNING - void declaration
     */
    public sprvrn(sprdqn sprdqn2, sprwin sprwin2) {
        super((sprcjn)arg0);
        void arg1;
        void arg0;
        this.cfr_renamed_4 = sprwin2 == null ? arg0.cfr_renamed_13380() : arg1;
    }

    private /* synthetic */ void cfr_renamed_13481(sprvqo arg0, boolean arg1) {
        int n;
        sprvqo sprvqo2 = arg0;
        sprfzo sprfzo2 = sprvqo2.cfr_renamed_13261();
        sprrpp sprrpp2 = sprvqo2.cfr_renamed_13482(this.cfr_renamed_2820().cfr_renamed_12479());
        sprfpn sprfpn2 = new sprfpn();
        String string = this.cfr_renamed_2820().cfr_renamed_13444(sprfzo2);
        if (!arg1) {
            sprexo sprexo2 = (sprexo)sprrpp2.cfr_renamed_576(0);
            sprvrn sprvrn2 = this;
            sprvrn2.cfr_renamed_4.cfr_renamed_12423(sprpcr.cfr_renamed_9("\\>B$X9VzV;H'Y"));
            sprvrn2.cfr_renamed_4.cfr_renamed_12405("d", sprfpn2.cfr_renamed_13146(sprhnn.cfr_renamed_13483(sprexo2, false)));
            sprvrn2.cfr_renamed_4.cfr_renamed_12439();
        }
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_13484().cfr_renamed_11861()) {
            sprvrn sprvrn3;
            sprvqo sprvqo3 = arg0;
            int n3 = sprvqo3.cfr_renamed_13484().cfr_renamed_7861(n);
            int n4 = (Integer)sprvqo3.cfr_renamed_13484().cfr_renamed_13485(n);
            sprexo sprexo3 = (sprexo)sprrpp2.cfr_renamed_576(n4);
            if (arg1) {
                sprvrn sprvrn4 = this;
                sprvrn4.cfr_renamed_4.cfr_renamed_12423("path");
                Object[] objectArray = new Object[2];
                objectArray[0] = string;
                objectArray[1] = n3;
                sprvrn4.cfr_renamed_4.cfr_renamed_12405("id", sprraia.cfr_renamed_11562(sprzjh.cfr_renamed_9("\\jZ9\\kZ"), objectArray));
                sprvrn3 = this;
            } else {
                sprvrn sprvrn5 = this;
                sprvrn3 = sprvrn5;
                sprvrn5.cfr_renamed_4.cfr_renamed_12423(sprpcr.cfr_renamed_9("V;H'Y"));
                sprvrn5.cfr_renamed_4.cfr_renamed_12405(sprzjh.cfr_renamed_9("R4N9H>B"), sprxsp.cfr_renamed_12396(n3));
                sprvrn5.cfr_renamed_4.cfr_renamed_12405(sprpcr.cfr_renamed_9("Y8C>KzP3GzI"), Integer.toString(sprvrn.cfr_renamed_13468(sprfzo2.cfr_renamed_13027().cfr_renamed_13469(n3).cfr_renamed_13470(), sprfzo2)));
            }
            sprvrn3.cfr_renamed_4.cfr_renamed_12405("d", n3 != 32 ? sprfpn2.cfr_renamed_13146(sprhnn.cfr_renamed_13483(sprexo3, arg1)) : sprzjh.cfr_renamed_9("\u0017\u0017v\u0017"));
            this.cfr_renamed_4.cfr_renamed_12439();
            n2 = ++n;
        }
    }

    public void cfr_renamed_13486(sprvqo arg0) {
        sprfzo sprfzo2 = arg0.cfr_renamed_13261();
        sprvrn sprvrn2 = this;
        String string = sprvrn2.cfr_renamed_2820().cfr_renamed_13444(sprfzo2);
        sprvrn2.cfr_renamed_4.cfr_renamed_12423("font");
        sprvrn2.cfr_renamed_4.cfr_renamed_12405("id", string);
        sprvrn2.cfr_renamed_4.cfr_renamed_12405(sprpcr.cfr_renamed_9("Y8C>KzP3GzI"), Integer.toString(sprvrn.cfr_renamed_13468(sprfzo2.cfr_renamed_13487(), sprfzo2)));
        sprvrn2.cfr_renamed_4.cfr_renamed_12423("font-face");
        sprvrn2.cfr_renamed_4.cfr_renamed_12405("font-family", sprfzo2.cfr_renamed_13460());
        sprvrn2.cfr_renamed_4.cfr_renamed_12405("font-weight", sprwjn.cfr_renamed_13431(sprfzo2.cfr_renamed_13303()));
        sprvrn2.cfr_renamed_4.cfr_renamed_12405("font-style", sprwjn.cfr_renamed_13432(sprfzo2.cfr_renamed_13303()));
        sprvrn2.cfr_renamed_4.cfr_renamed_12405(sprzjh.cfr_renamed_9("/I3S)\n*B(\n?J"), sprpcr.cfr_renamed_9("\u0003g\u0005o\u0001"));
        sprvrn2.cfr_renamed_4.cfr_renamed_12405(sprzjh.cfr_renamed_9("9F*\n2B3@2S"), Integer.toString(sprvrn.cfr_renamed_13468(sprfzo2.cfr_renamed_13488(), sprfzo2)));
        sprvrn2.cfr_renamed_4.cfr_renamed_12405(sprpcr.cfr_renamed_9("/\u001c?T>V?E"), Integer.toString(sprvrn.cfr_renamed_13468(sprfzo2.cfr_renamed_13489(), sprfzo2)));
        sprvrn2.cfr_renamed_4.cfr_renamed_12405(sprzjh.cfr_renamed_9(";T9B4S"), Integer.toString(sprvrn.cfr_renamed_13468(sprfzo2.cfr_renamed_13490(), sprfzo2)));
        sprvrn2.cfr_renamed_4.cfr_renamed_12405(sprpcr.cfr_renamed_9("U2B4T9E"), Integer.toString(sprvrn.cfr_renamed_13468(sprfzo2.cfr_renamed_13491(), sprfzo2)));
        sprvrn2.cfr_renamed_4.cfr_renamed_12423("font-face-src");
        sprvrn2.cfr_renamed_4.cfr_renamed_12423("font-face-name");
        sprvrn2.cfr_renamed_4.cfr_renamed_12405("name", sprfzo2.cfr_renamed_13492());
        sprvrn2.cfr_renamed_4.cfr_renamed_12439();
        sprvrn2.cfr_renamed_4.cfr_renamed_12439();
        sprvrn2.cfr_renamed_4.cfr_renamed_12439();
        sprvrn2.cfr_renamed_13481(arg0, false);
        sprvrn2.cfr_renamed_4.cfr_renamed_12439();
    }

    public void cfr_renamed_13493(sprvqo arg0) {
        this.cfr_renamed_13481(arg0, true);
    }
}


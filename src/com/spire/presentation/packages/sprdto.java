/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraep;
import com.spire.presentation.packages.spralq;
import com.spire.presentation.packages.sprazo;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprern;
import com.spire.presentation.packages.sprgfja;
import com.spire.presentation.packages.sprhxo;
import com.spire.presentation.packages.sprimp;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprqhp;
import com.spire.presentation.packages.sprqt;
import com.spire.presentation.packages.sprqyo;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrdn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprusca;
import com.spire.presentation.packages.sprwmr;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprxzo;
import com.spire.presentation.packages.sprznp;
import java.util.Iterator;

@sprtea
public class sprdto
extends sprhxo {
    private static final sprusca cfr_renamed_1;
    public static final String cfr_renamed_2 = "/[Content_Types].xml";
    private sprqt cfr_renamed_3;
    private boolean cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void cfr_renamed_17159(sprwmr arg0, spralq arg1) {
        String string = null;
        String string2 = null;
        while (arg0.cfr_renamed_12287()) {
            switch (cfr_renamed_1.cfr_renamed_12854(arg0.cfr_renamed_12286())) {
                case 4: {
                    string2 = arg0.cfr_renamed_97();
                    break;
                }
                case 3: {
                    string = arg0.cfr_renamed_97();
                    break;
                }
            }
        }
        if (sprznp.cfr_renamed_12328(string) && sprznp.cfr_renamed_12328(string2)) {
            arg1.put(string2, string);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_17160(spreen arg0) throws Exception {
        sprimp sprimp2 = new sprimp(arg0);
        try {
            block4: while (true) {
                sprimp sprimp3 = sprimp2;
                while (sprimp3.cfr_renamed_12189()) {
                    sprqyo sprqyo2 = new sprqyo(sprdto.cfr_renamed_17161(sprimp2.cfr_renamed_12188()), "");
                    sprdto sprdto2 = this;
                    sprdto2.cfr_renamed_13274().cfr_renamed_13275(sprqyo2);
                    if (sprdto2.cfr_renamed_4 && !this.cfr_renamed_17162(sprqyo2)) {
                        sprimp3 = sprimp2;
                        continue;
                    }
                    try {
                        sprimp2.cfr_renamed_12191(sprqyo2.cfr_renamed_13232());
                        sprqyo2.cfr_renamed_13232().cfr_renamed_11548(0L);
                    }
                    catch (sprrdn sprrdn2) {
                        String string = sprern.cfr_renamed_9("1N\u0005B\bEDT\u000b\u0000\u0001X\u0010R\u0005C\u0010\u0000\u001f\u0010\u0019\u0000\u0014A\u0016TJ");
                        if (this.cfr_renamed_3 == null) continue block4;
                        this.cfr_renamed_3.cfr_renamed_12475(0, -1, string, sprqyo2.cfr_renamed_313());
                    }
                    continue block4;
                }
                break;
            }
            if (sprimp2 == null) return;
            sprimp2.cfr_renamed_11665();
            return;
        }
        catch (Throwable throwable) {
            if (sprimp2 == null) throw throwable;
            sprimp2.cfr_renamed_11665();
            throw throwable;
        }
    }

    @Override
    public void cfr_renamed_11631(spreen arg0) throws Exception {
        Iterator iterator;
        sprqhp sprqhp2 = new sprqhp(arg0);
        Iterator iterator2 = iterator = this.cfr_renamed_13274().iterator();
        while (iterator2.hasNext()) {
            sprqyo sprqyo2 = (sprqyo)iterator.next();
            iterator2 = iterator;
            sprqyo sprqyo3 = sprqyo2;
            sprqyo3.cfr_renamed_13232().cfr_renamed_11548(0L);
            sprqhp2.cfr_renamed_12178(sprdto.cfr_renamed_17163(sprqyo3.cfr_renamed_313()), sprqyo2.cfr_renamed_13232());
        }
        sprqhp2.cfr_renamed_3120();
    }

    public sprdto(spreen arg0) throws Exception {
        this(arg0, false, null);
    }

    private static /* synthetic */ String cfr_renamed_17161(String arg0) {
        return new StringBuilder().insert(0, "/").append(arg0.replace("\\", "/")).toString();
    }

    private /* synthetic */ void cfr_renamed_17164(spralq arg0) {
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_13274().iterator();
        while (iterator2.hasNext()) {
            sprqyo sprqyo2 = (sprqyo)iterator.next();
            String string = (String)arg0.get(sprqyo2.cfr_renamed_313());
            if (!sprznp.cfr_renamed_12328(string)) {
                string = (String)arg0.get(sprqyo2.cfr_renamed_4780());
            }
            sprqyo2.cfr_renamed_17142(string);
            iterator2 = iterator;
        }
    }

    private /* synthetic */ void cfr_renamed_17165(spreen arg0) throws Exception {
        sprdto sprdto2 = this;
        sprdto2.cfr_renamed_17160(arg0);
        sprdto2.cfr_renamed_17164(sprdto2.cfr_renamed_17166());
        sprdto2.cfr_renamed_17157();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprdto(String string) throws Exception {
        void arg0;
        this.cfr_renamed_3 = null;
        sprgfja sprgfja2 = new sprgfja((String)arg0, 3, 1);
        try {
            this.cfr_renamed_17165(sprgfja2);
            if (sprgfja2 == null) return;
            sprgfja2.cfr_renamed_2637();
            return;
        }
        catch (Throwable throwable) {
            if (sprgfja2 == null) throw throwable;
            sprgfja2.cfr_renamed_2637();
            throw throwable;
        }
    }

    private /* synthetic */ boolean cfr_renamed_17162(sprqyo arg0) {
        int n = spraep.cfr_renamed_17167(arg0.cfr_renamed_4780());
        return n != 7 && n != 2 && n != 9 && n != 5 && n != 42 && n != 4 && n != 6 && n != 36 && n != 8 && n != 3 && n != 44;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void cfr_renamed_17168(sprwmr arg0, spralq arg1) {
        String string = null;
        String string2 = null;
        while (arg0.cfr_renamed_12287()) {
            switch (cfr_renamed_1.cfr_renamed_12854(arg0.cfr_renamed_12286())) {
                case 2: {
                    string2 = arg0.cfr_renamed_97();
                    break;
                }
                case 3: {
                    string = arg0.cfr_renamed_97();
                    break;
                }
            }
        }
        if (sprznp.cfr_renamed_12328(string) && sprznp.cfr_renamed_12328(string2)) {
            arg1.put(string2, string);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprdto(spreen spreen2, boolean bl, sprqt sprqt2) throws Exception {
        void arg1;
        void arg2;
        sprdto sprdto2 = this;
        sprdto2.cfr_renamed_3 = null;
        sprdto2.cfr_renamed_3 = arg2;
        this.cfr_renamed_4 = arg1;
        this.cfr_renamed_17165(spreen2);
    }

    public void cfr_renamed_17169() {
        sprwvn sprwvn2 = new sprwvn();
        for (sprqyo sprqyo2 : this.cfr_renamed_13274()) {
            if (!"application/vnd.openxmlformats-package.relationships+xml".equals(sprqyo2.cfr_renamed_696()) && !cfr_renamed_2.equals(sprqyo2.cfr_renamed_313())) continue;
            sprovja.cfr_renamed_11658(sprwvn2, sprqyo2);
        }
        Iterator iterator = sprwvn2.iterator();
        Iterator iterator2 = iterator;
        while (iterator2.hasNext()) {
            sprqyo sprqyo2;
            sprqyo2 = (sprqyo)iterator.next();
            iterator2 = iterator;
            this.cfr_renamed_13274().cfr_renamed_2437(sprqyo2.cfr_renamed_313());
        }
        sprazo.cfr_renamed_13285(this, false);
        sprxzo.cfr_renamed_13286(this, false);
    }

    static {
        String[] stringArray = new String[5];
        stringArray[0] = "Default";
        stringArray[1] = "Override";
        stringArray[2] = "Extension";
        stringArray[3] = "ContentType";
        stringArray[4] = "PartName";
        cfr_renamed_1 = new sprusca(stringArray);
    }

    private static /* synthetic */ String cfr_renamed_17163(String arg0) {
        char[] cArray = new char[1];
        cArray[0] = 47;
        return sprraia.cfr_renamed_15325(arg0, cArray);
    }

    public sprdto() {
        this.cfr_renamed_3 = null;
    }

    private /* synthetic */ spralq cfr_renamed_17166() {
        sprwmr sprwmr2;
        spralq spralq2 = new spralq();
        sprqyo sprqyo2 = this.cfr_renamed_17152(cfr_renamed_2);
        sprwmr sprwmr3 = sprwmr2 = new sprwmr(sprqyo2.cfr_renamed_13232());
        block4: while (sprwmr3.cfr_renamed_12372("Types")) {
            switch (cfr_renamed_1.cfr_renamed_12854(sprwmr2.cfr_renamed_12286())) {
                case 0: {
                    sprwmr sprwmr4 = sprwmr2;
                    while (false) {
                    }
                    sprwmr3 = sprwmr4;
                    sprdto.cfr_renamed_17168(sprwmr4, spralq2);
                    continue block4;
                }
                case 1: {
                    sprwmr sprwmr5 = sprwmr2;
                    sprwmr3 = sprwmr5;
                    sprdto.cfr_renamed_17159(sprwmr5, spralq2);
                    continue block4;
                }
            }
            sprwmr sprwmr6 = sprwmr2;
            sprwmr3 = sprwmr6;
            sprwmr6.cfr_renamed_12353();
        }
        return spralq2;
    }
}


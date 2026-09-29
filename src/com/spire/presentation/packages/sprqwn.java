/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazy;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprfso;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprhyo;
import com.spire.presentation.packages.sprivo;
import com.spire.presentation.packages.sprjzo;
import com.spire.presentation.packages.sprkto;
import com.spire.presentation.packages.sprnuo;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprpkja;
import com.spire.presentation.packages.sprrpo;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtvp;
import com.spire.presentation.packages.sprvqo;
import com.spire.presentation.packages.sprzyn;
import java.util.Iterator;

@sprtea
public class sprqwn {
    private sprzyn cfr_renamed_4;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_13486(sprvqo arg0) throws Exception {
        block3: {
            sprpdja sprpdja2 = new sprpdja();
            try {
                arg0.cfr_renamed_13227(sprpdja2);
                sprfzo sprfzo2 = new sprjzo().cfr_renamed_15067(sprpdja2.cfr_renamed_4529(), arg0.cfr_renamed_13261().cfr_renamed_13492());
                this.cfr_renamed_15068(sprfzo2);
                if (sprpdja2 == null) break block3;
            }
            catch (Throwable throwable) {
                if (sprpdja2 != null) {
                    sprpdja2.cfr_renamed_2637();
                }
                throw throwable;
            }
            sprpdja2.cfr_renamed_2637();
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_15068(sprfzo arg0) throws Exception {
        spreen spreen2 = null;
        try {
            Object object;
            if (arg0.cfr_renamed_15069()) {
                object = new sprjzo();
                spreen2 = new sprpdja();
                ((sprjzo)object).cfr_renamed_15070(arg0, spreen2);
                spreen2.cfr_renamed_11548(0L);
            } else {
                spreen2 = arg0.cfr_renamed_2609().cfr_renamed_15071();
            }
            object = new sprhyo(spreen2);
            if (!((sprhyo)object).cfr_renamed_15072()) return;
            sprqwn sprqwn2 = this;
            sprfzo sprfzo2 = arg0;
            sprqwn sprqwn3 = this;
            sprfzo sprfzo3 = arg0;
            this.cfr_renamed_15073(sprfzo3);
            sprqwn3.cfr_renamed_15074(sprfzo3, (sprhyo)object);
            sprqwn3.cfr_renamed_15075(arg0);
            this.cfr_renamed_15076(sprfzo2);
            sprqwn2.cfr_renamed_15077(sprfzo2, (sprhyo)object);
            sprqwn2.cfr_renamed_15078(arg0);
            return;
        }
        finally {
            spreen2.dispose();
            spreen2 = null;
        }
    }

    private /* synthetic */ void cfr_renamed_15073(sprfzo arg0) {
        sprqwn sprqwn2 = this;
        sprqwn2.cfr_renamed_4.cfr_renamed_14968(arg0.cfr_renamed_13492());
        sprqwn2.cfr_renamed_4.cfr_renamed_14970((byte)-88);
        sprqwn2.cfr_renamed_4.cfr_renamed_15016((byte)0);
        sprqwn2.cfr_renamed_4.cfr_renamed_14970((byte)-87);
        sprqwn2.cfr_renamed_4.cfr_renamed_14973((byte)79);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_15079(sprfzo arg0, sprhyo arg1, sprkto arg2, sprrpo arg3, int arg4, int arg5) {
        sprqwn sprqwn2;
        byte[] byArray;
        block4: {
            block3: {
                long l = (long)arg3.cfr_renamed_15080().cfr_renamed_576(arg5 & 0xFFFF) + (arg2.cfr_renamed_3 & 0xFFFFFFFFL);
                int n = 0;
                byArray = new byte[(((arg5 & 0xFFFF) + 1 < arg3.cfr_renamed_15080().cfr_renamed_11861() ? (n = sprpkja.cfr_renamed_15081(arg3.cfr_renamed_15080().cfr_renamed_576((arg5 & 0xFFFF) + 1) - arg3.cfr_renamed_15080().cfr_renamed_576(arg5 & 0xFFFF))) : (n = sprpkja.cfr_renamed_15082((arg2.cfr_renamed_2 & 0xFFFFFFFFL) - (sprpkja.cfr_renamed_15083(arg3.cfr_renamed_15080().cfr_renamed_576(arg5 & 0xFFFF)) & 0xFFFFFFFFL)))) & 0xFFFF) + 6];
                sprhyo sprhyo2 = arg1;
                sprhyo2.cfr_renamed_15084().cfr_renamed_14060().cfr_renamed_11548(l);
                sprhyo2.cfr_renamed_15084().cfr_renamed_14060().cfr_renamed_11556(byArray, 6, n & 0xFFFF);
                sprpdja sprpdja2 = new sprpdja();
                try {
                    sprruo sprruo2;
                    sprruo sprruo3 = sprruo2 = new sprruo(sprpdja2);
                    sprruo sprruo4 = sprruo2;
                    sprruo4.cfr_renamed_11594((byte)1);
                    sprruo4.cfr_renamed_11594((byte)0);
                    sprruo3.cfr_renamed_15085((n & 0xFFFF) + 4);
                    sprruo2.cfr_renamed_15085(arg5 & 0xFFFF);
                    sprruo3.cfr_renamed_14060().cfr_renamed_11547(0L, 0);
                    sprruo2.cfr_renamed_14060().cfr_renamed_11556(byArray, 0, 6);
                    if (sprpdja2 == null) break block3;
                    sprqwn2 = this;
                }
                catch (Throwable throwable) {
                    if (sprpdja2 != null) {
                        sprpdja2.cfr_renamed_2637();
                    }
                    throw throwable;
                }
                sprpdja2.cfr_renamed_2637();
                break block4;
            }
            sprqwn2 = this;
        }
        sprqwn2.cfr_renamed_4.cfr_renamed_14971(sprpkja.cfr_renamed_15081(byArray.length));
        sprqwn sprqwn3 = this;
        sprqwn3.cfr_renamed_4.cfr_renamed_14970((byte)-93);
        sprqwn3.cfr_renamed_4.cfr_renamed_14971(arg4);
        sprqwn3.cfr_renamed_4.cfr_renamed_14970((byte)-94);
        sprqwn3.cfr_renamed_4.cfr_renamed_14973((byte)83);
        sprqwn3.cfr_renamed_4.cfr_renamed_15048(byArray);
    }

    private /* synthetic */ void cfr_renamed_15075(sprfzo arg0) {
        this.cfr_renamed_4.cfr_renamed_14973((byte)81);
    }

    private /* synthetic */ void cfr_renamed_15078(sprfzo arg0) {
        this.cfr_renamed_4.cfr_renamed_14973((byte)84);
    }

    private /* synthetic */ void cfr_renamed_15077(sprfzo arg0, sprhyo arg1) {
        int n;
        int n2;
        Iterator iterator;
        sprkto sprkto2 = spresca.cfr_renamed_11777(arg1.cfr_renamed_15086().cfr_renamed_12347("glyf"), sprkto.class);
        sprkto sprkto3 = spresca.cfr_renamed_11777(arg1.cfr_renamed_15086().cfr_renamed_12347("loca"), sprkto.class);
        sprhyo sprhyo2 = arg1;
        sprhyo2.cfr_renamed_15087("head");
        sprnuo sprnuo2 = sprnuo.cfr_renamed_15088(sprhyo2.cfr_renamed_15084());
        sprhyo2.cfr_renamed_15087("loca");
        sprrpo sprrpo2 = sprrpo.cfr_renamed_15089(sprhyo2.cfr_renamed_15084(), sprkto3.cfr_renamed_2, sprnuo2.cfr_renamed_15090());
        sprtvp sprtvp2 = sprrpo2.cfr_renamed_15080();
        Iterator iterator2 = iterator = arg0.cfr_renamed_13027().cfr_renamed_15091().iterator();
        while (iterator2.hasNext()) {
            sprivo sprivo2 = (sprivo)iterator.next();
            int n3 = sprivo2.cfr_renamed_12561();
            n2 = sprivo2.cfr_renamed_13076();
            if ((n3 & 0xFFFF) == arg0.cfr_renamed_13027().cfr_renamed_15092().cfr_renamed_12561()) {
                iterator2 = iterator;
                continue;
            }
            this.cfr_renamed_15079(arg0, arg1, sprkto2, sprrpo2, n3, n2);
            iterator2 = iterator;
        }
        int n4 = n = 0;
        while ((n4 & 0xFFFF) < sprtvp2.cfr_renamed_11861() - 1) {
            sprfzo sprfzo2;
            long l = (long)sprtvp2.cfr_renamed_576(n & 0xFFFF) + (sprkto2.cfr_renamed_3 & 0xFFFFFFFFL);
            n2 = 0;
            if ((n & 0xFFFF) + 1 < sprtvp2.cfr_renamed_11861()) {
                sprfzo2 = arg0;
                n2 = sprpkja.cfr_renamed_15081(sprtvp2.cfr_renamed_576((n & 0xFFFF) + 1) - sprtvp2.cfr_renamed_576(n & 0xFFFF));
            } else {
                n2 = sprpkja.cfr_renamed_15082((sprkto2.cfr_renamed_2 & 0xFFFFFFFFL) - (sprpkja.cfr_renamed_15083(sprtvp2.cfr_renamed_576(n & 0xFFFF)) & 0xFFFFFFFFL));
                sprfzo2 = arg0;
            }
            if (sprfzo2.cfr_renamed_13027().cfr_renamed_14372(n & 0xFFFF).cfr_renamed_13076() != (n & 0xFFFF)) {
                this.cfr_renamed_15079(arg0, arg1, sprkto2, sprrpo2, arg0.cfr_renamed_13027().cfr_renamed_15092().cfr_renamed_12561(), n);
            }
            n4 = ++n;
        }
        this.cfr_renamed_15079(arg0, arg1, sprkto2, sprrpo2, arg0.cfr_renamed_13027().cfr_renamed_15092().cfr_renamed_12561(), arg0.cfr_renamed_13027().cfr_renamed_15092().cfr_renamed_13076());
    }

    private /* synthetic */ void cfr_renamed_15076(sprfzo arg0) {
        sprqwn sprqwn2 = this;
        sprqwn2.cfr_renamed_4.cfr_renamed_14968(arg0.cfr_renamed_13492());
        sprqwn2.cfr_renamed_4.cfr_renamed_14970((byte)-88);
        sprqwn2.cfr_renamed_4.cfr_renamed_14973((byte)82);
    }

    @sprtea
    public sprqwn(sprzyn sprzyn2) {
        sprqwn sprqwn2 = this;
        sprqwn2.cfr_renamed_4 = null;
        sprqwn2.cfr_renamed_4 = sprzyn2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_15074(sprfzo arg0, sprhyo arg1) {
        block6: {
            sprpdja sprpdja2 = new sprpdja();
            try {
                sprfso sprfso2;
                sprruo sprruo2;
                sprruo sprruo3 = sprruo2 = new sprruo(sprpdja2);
                sprruo sprruo4 = sprruo2;
                sprruo sprruo5 = sprruo2;
                sprruo5.cfr_renamed_11594((byte)0);
                sprruo5.cfr_renamed_11594((byte)0);
                sprruo4.cfr_renamed_15085(65535);
                sprruo4.cfr_renamed_11594((byte)1);
                sprruo3.cfr_renamed_11594((byte)0);
                sprruo3.cfr_renamed_15085(sprpkja.cfr_renamed_15081(arg0.cfr_renamed_13027().cfr_renamed_11861()) & 0xFFFF);
                sprfso sprfso3 = sprfso2 = new sprfso(arg1.cfr_renamed_15093().cfr_renamed_2);
                sprfso sprfso4 = sprfso2;
                sprfso2.cfr_renamed_15094("head", arg1.cfr_renamed_15095("head"));
                sprfso4.cfr_renamed_15094("hhea", arg1.cfr_renamed_15095("hhea"));
                sprfso4.cfr_renamed_15094("hmtx", arg1.cfr_renamed_15095("hmtx"));
                sprfso3.cfr_renamed_15094("maxp", arg1.cfr_renamed_15095("maxp"));
                sprfso3.cfr_renamed_15094(sprazy.cfr_renamed_9("{<u*"), new byte[0]);
                if (arg1.cfr_renamed_15086().cfr_renamed_12431("cvt ")) {
                    sprfso2.cfr_renamed_15094("cvt ", arg1.cfr_renamed_15095("cvt "));
                }
                if (arg1.cfr_renamed_15086().cfr_renamed_12431("fpgm")) {
                    sprfso2.cfr_renamed_15094("fpgm", arg1.cfr_renamed_15095("fpgm"));
                }
                if (arg1.cfr_renamed_15086().cfr_renamed_12431("prep")) {
                    sprfso2.cfr_renamed_15094("prep", arg1.cfr_renamed_15095("prep"));
                }
                byte[] byArray = sprfso2.cfr_renamed_15096();
                sprruo sprruo6 = sprruo2;
                sprruo6.cfr_renamed_15085(18260);
                sprruo6.cfr_renamed_15097(sprpkja.cfr_renamed_15083(byArray.length));
                sprruo2.cfr_renamed_15098(byArray, 0, byArray.length);
                sprruo sprruo7 = sprruo2;
                sprruo7.cfr_renamed_15085(65535);
                sprruo7.cfr_renamed_15097(0L);
                sprqwn sprqwn2 = this;
                sprqwn2.cfr_renamed_4.cfr_renamed_14971(sprpkja.cfr_renamed_15082(sprruo2.cfr_renamed_14060().cfr_renamed_806()));
                sprqwn2.cfr_renamed_4.cfr_renamed_14970((byte)-89);
                this.cfr_renamed_4.cfr_renamed_14973((byte)80);
                sprqwn2.cfr_renamed_4.cfr_renamed_15048(sprpdja2.cfr_renamed_4529());
                if (sprpdja2 == null) break block6;
            }
            catch (Throwable throwable) {
                if (sprpdja2 != null) {
                    sprpdja2.cfr_renamed_2637();
                }
                throw throwable;
            }
            sprpdja2.cfr_renamed_2637();
            return;
        }
    }
}


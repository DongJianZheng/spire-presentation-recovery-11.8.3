/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprczo;
import com.spire.presentation.packages.sprdqn;
import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.sprfmp;
import com.spire.presentation.packages.sprfsn;
import com.spire.presentation.packages.sprgdp;
import com.spire.presentation.packages.sprghp;
import com.spire.presentation.packages.sprhlp;
import com.spire.presentation.packages.spriap;
import com.spire.presentation.packages.sprlrn;
import com.spire.presentation.packages.sprnon;
import com.spire.presentation.packages.sprnyja;
import com.spire.presentation.packages.sprpip;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvmp;
import com.spire.presentation.packages.sprvyo;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprwin;
import com.spire.presentation.packages.sprwjn;
import com.spire.presentation.packages.sprxvo;
import com.spire.presentation.packages.sprywa;
import java.util.Iterator;

@sprtea
public class sprwnn
extends sprfsn {
    private sprnon cfr_renamed_1;
    private sprnon cfr_renamed_2;
    private sprwin cfr_renamed_3;
    private sprnon cfr_renamed_4;

    @sprtea
    public void cfr_renamed_13498() {
        sprnyja sprnyja2;
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_2.iterator();
        while (iterator2.hasNext()) {
            sprnyja2 = (sprnyja)iterator.next();
            this.cfr_renamed_13504((sprpln)sprnyja2.getValue(), (String)sprnyja2.getKey());
            iterator2 = iterator;
        }
        iterator = this.cfr_renamed_1.iterator();
        Iterator iterator3 = iterator;
        while (iterator3.hasNext()) {
            sprnyja2 = (sprnyja)iterator.next();
            this.cfr_renamed_13505((sprpln)sprnyja2.getValue(), (String)sprnyja2.getKey());
            iterator3 = iterator;
        }
        iterator = this.cfr_renamed_4.iterator();
        Iterator iterator4 = iterator;
        while (iterator4.hasNext()) {
            sprnyja2 = (sprnyja)iterator.next();
            this.cfr_renamed_13506((sprpln)sprnyja2.getValue(), (String)sprnyja2.getKey());
            iterator4 = iterator;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public String cfr_renamed_13463(sprpln arg0) {
        String string;
        if (arg0 == null) {
            return "none";
        }
        switch (arg0.cfr_renamed_13338()) {
            case 3: {
                string = this.cfr_renamed_2.cfr_renamed_13449(arg0);
                break;
            }
            case 1: {
                string = this.cfr_renamed_1.cfr_renamed_13449(arg0);
                break;
            }
            case 2: 
            case 4: {
                string = this.cfr_renamed_4.cfr_renamed_13449(arg0);
                break;
            }
            case 0: {
                return sprwjn.cfr_renamed_13163(((sprghp)arg0).cfr_renamed_12553());
            }
            default: {
                return "none";
            }
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = string;
        return sprraia.cfr_renamed_11562(sprywa.cfr_renamed_9("b){s4 '&>"), objectArray);
    }

    private /* synthetic */ void cfr_renamed_13504(sprpln arg0, String arg1) {
        sprwnn sprwnn2;
        sprgdp sprgdp2 = (sprgdp)arg0;
        sprwnn sprwnn3 = this;
        sprwnn3.cfr_renamed_3.cfr_renamed_12423("linearGradient");
        sprwnn3.cfr_renamed_3.cfr_renamed_12405("id", arg1);
        sprwnn3.cfr_renamed_3.cfr_renamed_12405(sprvmp.cfr_renamed_9(";4=\"5#22\t(52/"), "userSpaceOnUse");
        sprwnn3.cfr_renamed_3.cfr_renamed_12405(sprywa.cfr_renamed_9("(g)r:s\u0016r/\u007f4s"), "repeat");
        sprwnn3.cfr_renamed_3.cfr_renamed_12405("x1", sprebp.cfr_renamed_13083(sprgdp2.cfr_renamed_12644().cfr_renamed_1980()));
        sprwnn3.cfr_renamed_3.cfr_renamed_12405("y1", sprebp.cfr_renamed_13083(sprgdp2.cfr_renamed_12644().spr\u3181()));
        sprwnn3.cfr_renamed_3.cfr_renamed_12405("x2", sprebp.cfr_renamed_13083(sprgdp2.cfr_renamed_12644().cfr_renamed_13341()));
        sprgdp sprgdp3 = sprgdp2;
        sprwnn3.cfr_renamed_3.cfr_renamed_12405("y2", sprebp.cfr_renamed_13083(sprgdp3.cfr_renamed_12644().cfr_renamed_13342()));
        if (sprgdp3.cfr_renamed_12672() != null) {
            this.cfr_renamed_3.cfr_renamed_12405(sprvmp.cfr_renamed_9(";4=\"5#22\b4=(/ 341"), sprwjn.cfr_renamed_13420(sprgdp2.cfr_renamed_12672()));
        }
        if (sprgdp2.cfr_renamed_12779() == null) {
            sprwnn sprwnn4 = this;
            sprwnn2 = sprwnn4;
            sprwnn4.cfr_renamed_13507(sprgdp2.cfr_renamed_12645(), 0.0f);
            sprwnn4.cfr_renamed_13507(sprgdp2.cfr_renamed_12646(), 1.0f);
        } else {
            int n;
            sprfmp[] sprfmpArray = sprgdp2.cfr_renamed_12779();
            int n2 = sprfmpArray.length;
            int n3 = n = 0;
            while (n3 < n2) {
                sprfmp sprfmp2 = sprfmpArray[n];
                this.cfr_renamed_13507(sprfmp2.cfr_renamed_12553(), sprfmp2.cfr_renamed_3274());
                n3 = ++n;
            }
            sprwnn2 = this;
        }
        sprwnn2.cfr_renamed_3.cfr_renamed_12439();
    }

    private /* synthetic */ void cfr_renamed_13505(sprpln arg0, String arg1) {
        byte[] byArray = sprxvo.cfr_renamed_13333((sprhlp)arg0);
        this.cfr_renamed_13508(byArray, null, arg1);
    }

    public sprwnn(sprdqn arg0, sprwin arg1) {
        sprwnn sprwnn2 = this;
        super(arg0);
        this.cfr_renamed_3 = arg1;
        sprwnn sprwnn3 = this;
        sprwnn2.cfr_renamed_2 = new sprnon(arg0, sprywa.cfr_renamed_9("p)v?~>y/lkj"));
        sprwnn3.cfr_renamed_1 = new sprnon(arg0, sprvmp.cfr_renamed_9(".=2?.'v!"));
        sprwnn2.cfr_renamed_4 = new sprnon(arg0, sprywa.cfr_renamed_9("/r#c.e>lkj"));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_13506(sprpln arg0, String arg1) {
        block3: {
            sprpip sprpip2 = arg0.cfr_renamed_13338() == 4 ? spriap.cfr_renamed_13340((sprlrn)arg0) : (sprpip)arg0;
            sprvyo sprvyo2 = new sprvyo(sprpip2);
            try {
                sprwnn sprwnn2 = this;
                sprwnn2.cfr_renamed_13508(sprwnn2.cfr_renamed_2820().cfr_renamed_13314().cfr_renamed_13336(sprvyo2), sprpip2.cfr_renamed_12672().cfr_renamed_12099(), arg1);
                if (sprvyo2 == null) break block3;
            }
            catch (Throwable throwable) {
                if (sprvyo2 != null) {
                    sprvyo2.cfr_renamed_11665();
                }
                throw throwable;
            }
            sprvyo2.cfr_renamed_11665();
            return;
        }
    }

    private /* synthetic */ void cfr_renamed_13507(sprwbp arg0, float arg1) {
        float f;
        sprwnn sprwnn2 = this;
        sprwnn2.cfr_renamed_3.cfr_renamed_12423("stop");
        sprwnn2.cfr_renamed_3.cfr_renamed_12405("offset", sprebp.cfr_renamed_13083(arg1));
        sprwbp sprwbp2 = arg0;
        sprwnn2.cfr_renamed_3.cfr_renamed_12405(sprvmp.cfr_renamed_9("5(),k?)0)."), sprwjn.cfr_renamed_13163(sprwbp2));
        float f2 = (float)sprwbp2.cfr_renamed_1778() / 255.0f;
        if (f >= 0.0f && f2 < 1.0f) {
            this.cfr_renamed_3.cfr_renamed_12405(sprywa.cfr_renamed_9("(c4gvx+v8~/n"), sprebp.cfr_renamed_13083(f2));
        }
        this.cfr_renamed_3.cfr_renamed_12439();
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static float cfr_renamed_13465(sprpln arg0) {
        float f;
        float f2;
        block5: {
            block4: {
                f2 = 1.0f;
                if (arg0 == null) break block4;
                switch (arg0.cfr_renamed_13338()) {
                    case 2: {
                        f = f2 = ((sprpip)arg0).cfr_renamed_13509();
                        break block5;
                    }
                    case 0: {
                        f = f2 = (float)((sprghp)arg0).cfr_renamed_12553().cfr_renamed_1778() / 255.0f;
                        break block5;
                    }
                    default: {
                        f2 = 1.0f;
                    }
                }
            }
            f = f2;
        }
        if (f < 0.0f) return 1.0f;
        if (!(f2 > 1.0f)) return f2;
        return 1.0f;
    }

    @sprtea
    public void cfr_renamed_13508(byte[] arg0, sprqgp arg1, String arg2) {
        sprczo sprczo2 = sprsto.cfr_renamed_13321(arg0);
        sprwnn sprwnn2 = this;
        sprwnn2.cfr_renamed_3.cfr_renamed_12423("pattern");
        sprwnn2.cfr_renamed_3.cfr_renamed_12405("id", arg2);
        sprwnn2.cfr_renamed_3.cfr_renamed_12405(sprvmp.cfr_renamed_9("6=2(#.(\t(52/"), "userSpaceOnUse");
        sprwnn2.cfr_renamed_3.cfr_renamed_12405(sprywa.cfr_renamed_9("g:c/r)y\u0018x5c>y/B5~/d"), "userSpaceOnUse");
        sprwnn2.cfr_renamed_3.cfr_renamed_12405("x", "0");
        sprwnn2.cfr_renamed_3.cfr_renamed_12405("y", "0");
        sprwnn2.cfr_renamed_3.cfr_renamed_12405("width", sprebp.cfr_renamed_13083(sprczo2.cfr_renamed_1942()));
        sprwnn2.cfr_renamed_3.cfr_renamed_12405("height", sprebp.cfr_renamed_13083(sprczo2.cfr_renamed_1452()));
        if (arg1 != null) {
            this.cfr_renamed_3.cfr_renamed_12405(sprvmp.cfr_renamed_9("6=2(#.(\b4=(/ 341"), sprwjn.cfr_renamed_13420(arg1));
        }
        sprwnn sprwnn3 = this;
        sprwnn3.cfr_renamed_3.cfr_renamed_12423(sprywa.cfr_renamed_9("b(r"));
        Object[] objectArray = new Object[1];
        objectArray[0] = this.cfr_renamed_2820().cfr_renamed_13446(arg0, null);
        sprwnn3.cfr_renamed_3.cfr_renamed_12405("xlink:href", sprraia.cfr_renamed_11562(sprvmp.cfr_renamed_9("e'v!"), objectArray));
        sprwnn sprwnn4 = this;
        sprwnn4.cfr_renamed_3.cfr_renamed_12405("width", sprebp.cfr_renamed_13083(sprczo2.cfr_renamed_1942()));
        sprwnn4.cfr_renamed_3.cfr_renamed_12405("height", sprebp.cfr_renamed_13083(sprczo2.cfr_renamed_1452()));
        sprwnn4.cfr_renamed_3.cfr_renamed_12439();
        sprwnn4.cfr_renamed_3.cfr_renamed_12439();
    }
}


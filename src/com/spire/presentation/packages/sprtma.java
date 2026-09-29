/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprard;
import com.spire.presentation.packages.sprbie;
import com.spire.presentation.packages.sprbod;
import com.spire.presentation.packages.sprbva;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprfud;
import com.spire.presentation.packages.spride;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlee;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprltd;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprnhe;
import com.spire.presentation.packages.sprnpe;
import com.spire.presentation.packages.sprnua;
import com.spire.presentation.packages.spro;
import com.spire.presentation.packages.sproae;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpa;
import com.spire.presentation.packages.sprpua;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprrua;
import com.spire.presentation.packages.sprtkm;
import com.spire.presentation.packages.sprtxd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.spruqa;
import com.spire.presentation.packages.sprvsl;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwwa;
import com.spire.presentation.packages.spryce;
import com.spire.presentation.packages.spryee;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sprtma {
    public int cfr_renamed_93;
    public boolean cfr_renamed_86;
    private sprtzd cfr_renamed_152;
    private sprbod cfr_renamed_112;
    public int cfr_renamed_119;
    public int cfr_renamed_91;
    private List cfr_renamed_0;
    private List cfr_renamed_1;
    private Map cfr_renamed_2;
    public sprmee cfr_renamed_3;
    private List cfr_renamed_4;

    public sprtma(sprbod arg0, sprpa arg1, sprtzd arg2) throws IllegalArgumentException, sprrua {
        this(arg0, arg1, arg2, false);
    }

    public void cfr_renamed_599(sprtzd arg0, spro arg1) {
        this.cfr_renamed_2.put(arg0, arg1.cfr_renamed_152(null));
    }

    public void cfr_renamed_600(spro arg0) {
        this.cfr_renamed_4.addAll(arg0.cfr_renamed_152(null));
    }

    public void cfr_renamed_601(spro arg0) {
        this.cfr_renamed_1.addAll(arg0.cfr_renamed_152(null));
    }

    public void cfr_renamed_602(boolean arg0) {
        this.cfr_renamed_86 = arg0;
    }

    public void cfr_renamed_603(int arg0) {
        this.cfr_renamed_91 = arg0;
    }

    public void cfr_renamed_604(sprmee arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public void cfr_renamed_605(int arg0) {
        this.cfr_renamed_93 = arg0;
    }

    public void cfr_renamed_606(spro arg0) {
        this.cfr_renamed_0.addAll(arg0.cfr_renamed_152(null));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprbva cfr_renamed_607(sprnua arg0, BigInteger arg1, Date arg2) throws sprrua {
        sprvva sprvva2;
        sprooe sprooe2;
        sprvva sprvva3;
        sprtzd sprtzd2 = arg0.cfr_renamed_591();
        sprije sprije2 = new sprije(sprtzd2, sprume.cfr_renamed_3);
        spride spride2 = new spride(sprije2, arg0.cfr_renamed_581());
        spryce spryce2 = null;
        if (this.cfr_renamed_93 > 0 || this.cfr_renamed_119 > 0 || this.cfr_renamed_91 > 0) {
            sprvva3 = null;
            if (this.cfr_renamed_93 > 0) {
                sprvva3 = new sprooe(this.cfr_renamed_93);
            }
            sprooe2 = null;
            if (this.cfr_renamed_119 > 0) {
                sprooe2 = new sprooe(this.cfr_renamed_119);
            }
            sprvva2 = null;
            if (this.cfr_renamed_91 > 0) {
                sprvva2 = new sprooe(this.cfr_renamed_91);
            }
            spryce2 = new spryce((sprooe)sprvva3, sprooe2, (sprooe)sprvva2);
        }
        sprvva3 = null;
        if (this.cfr_renamed_86) {
            sprvva3 = new sprnpe(this.cfr_renamed_86);
        }
        sprooe2 = null;
        if (arg0.cfr_renamed_596() != null) {
            sprooe2 = new sprooe(arg0.cfr_renamed_596());
        }
        sprvva2 = this.cfr_renamed_152;
        if (arg0.cfr_renamed_608() != null) {
            sprvva2 = arg0.cfr_renamed_608();
        }
        sproae sproae2 = new sproae((sprtzd)sprvva2, spride2, new sprooe(arg1), new sprrpe(arg2), spryce2, (sprnpe)sprvva3, sprooe2, this.cfr_renamed_3, arg0.cfr_renamed_98());
        try {
            Object object;
            Object object2;
            sprtxd sprtxd2 = new sprtxd();
            if (arg0.cfr_renamed_609()) {
                sprtxd sprtxd3 = sprtxd2;
                sprtxd3.cfr_renamed_600(new sprltd(this.cfr_renamed_4));
                sprtxd3.cfr_renamed_606(new sprltd(this.cfr_renamed_0));
            }
            sprtxd2.cfr_renamed_601(new sprltd(this.cfr_renamed_1));
            if (!this.cfr_renamed_2.isEmpty()) {
                Object object3 = object2 = this.cfr_renamed_2.keySet().iterator();
                while (object3.hasNext()) {
                    object = (sprtzd)object2.next();
                    sprtxd2.cfr_renamed_599((sprtzd)object, new sprltd((Collection)this.cfr_renamed_2.get(object)));
                    object3 = object2;
                }
            }
            sprtxd2.cfr_renamed_610(this.cfr_renamed_112);
            object2 = sproae2.cfr_renamed_104("DER");
            object = sprtxd2.cfr_renamed_611(new sprard(sprm.cfr_renamed_93, (byte[])object2), true);
            return new sprbva((sprfud)object);
        }
        catch (sprlqd sprlqd2) {
            throw new sprrua(sprtkm.cfr_renamed_9("\u001aQ-L-\u00038F1F-B+J1D\u007fW6N:\u000e,W>N/\u0003+L4F1"), sprlqd2);
        }
        catch (IOException iOException) {
            throw new sprrua(sprvsl.cfr_renamed_9("*W\fJ\u001f[\u0006@\u0001\u000f\nA\f@\u000bF\u0001HOF\u0001I\u0000"), iOException);
        }
    }

    public void cfr_renamed_612(int arg0) {
        this.cfr_renamed_119 = arg0;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ 5;
        int cfr_ignored_0 = 5 << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 5 << 4 ^ 5 << 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprtma(sprbod sprbod2, sprpa sprpa2, sprtzd sprtzd2, boolean bl) throws IllegalArgumentException, sprrua {
        void arg2;
        void arg0;
        sprtma sprtma2 = this;
        sprtma sprtma3 = this;
        sprtma sprtma4 = this;
        sprtma sprtma5 = this;
        this.cfr_renamed_93 = -1;
        sprtma5.cfr_renamed_119 = -1;
        sprtma5.cfr_renamed_91 = -1;
        sprtma4.cfr_renamed_86 = false;
        sprtma4.cfr_renamed_3 = null;
        sprtma sprtma6 = this;
        sprtma3.cfr_renamed_4 = new ArrayList();
        sprtma6.cfr_renamed_1 = new ArrayList();
        sprtma3.cfr_renamed_0 = new ArrayList();
        sprtma3.cfr_renamed_2 = new HashMap();
        sprtma2.cfr_renamed_112 = arg0;
        sprtma2.cfr_renamed_152 = arg2;
        if (!sprbod2.cfr_renamed_613()) {
            throw new IllegalArgumentException(sprtkm.cfr_renamed_9("\fJ8M:Q\u0016M9L\u0018F1F-B+L-\u00032V,W\u007fK>U:\u0003>M\u007fB,P0@6B+F;\u0003<F-W6E6@>W:"));
        }
        sprcyd sprcyd2 = arg0.cfr_renamed_614();
        sprpua.cfr_renamed_567(sprcyd2);
        try {
            void arg3;
            void arg1;
            void v5 = arg1;
            OutputStream outputStream = v5.cfr_renamed_470();
            outputStream.write(sprcyd2.cfr_renamed_91());
            outputStream.close();
            if (v5.cfr_renamed_615().cfr_renamed_593().equals(sprdh.cfr_renamed_86)) {
                sprlee sprlee2 = new sprlee(arg1.cfr_renamed_580(), arg3 != false ? new sprnhe(new spryee(new sprmee(sprcyd2.cfr_renamed_102())), sprcyd2.cfr_renamed_114()) : null);
                void v6 = arg0;
                this.cfr_renamed_112 = new sprbod((sprbod)v6, new sprwwa(this, (sprbod)arg0, sprlee2), v6.cfr_renamed_616());
                return;
            }
            sprije sprije2 = new sprije(arg1.cfr_renamed_615().cfr_renamed_593());
            sprbie sprbie2 = new sprbie(sprije2, arg1.cfr_renamed_580(), arg3 != false ? new sprnhe(new spryee(new sprmee(sprcyd2.cfr_renamed_102())), new sprooe(sprcyd2.cfr_renamed_114())) : null);
            void v7 = arg0;
            this.cfr_renamed_112 = new sprbod((sprbod)v7, new spruqa(this, (sprbod)arg0, sprbie2), v7.cfr_renamed_616());
            return;
        }
        catch (IOException iOException) {
            throw new sprrua(sprvsl.cfr_renamed_9("*W\fJ\u001f[\u0006@\u0001\u000f\u001f]\u0000L\n\\\u001cF\u0001HOL\n]\u001bF\tF\fN\u001bJA"), iOException);
        }
    }
}


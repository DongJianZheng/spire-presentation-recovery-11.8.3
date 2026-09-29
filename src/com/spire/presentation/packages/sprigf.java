/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraen;
import com.spire.presentation.packages.sprahf;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfbf;
import com.spire.presentation.packages.sprfdn;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprhmm;
import com.spire.presentation.packages.sprjye;
import com.spire.presentation.packages.sprjze;
import com.spire.presentation.packages.sprkdf;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprmxn;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsbj;
import com.spire.presentation.packages.sprsdm;
import com.spire.presentation.packages.sprsff;
import com.spire.presentation.packages.spruqm;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class sprigf {
    public int cfr_renamed_119;
    private sprkdf cfr_renamed_91;
    private Set cfr_renamed_0;
    public int cfr_renamed_1;
    public sprrvm cfr_renamed_2;
    private Set cfr_renamed_3;
    private Set cfr_renamed_4;

    private /* synthetic */ Set cfr_renamed_645(Set arg0) {
        if (arg0 == null) {
            return arg0;
        }
        HashSet<sprlem> hashSet = new HashSet<sprlem>(arg0.size());
        for (Object e : arg0) {
            if (e instanceof String) {
                hashSet.add(new sprlem((String)e));
                continue;
            }
            hashSet.add((sprlem)e);
        }
        return hashSet;
    }

    private /* synthetic */ void cfr_renamed_640(String arg0) {
        this.cfr_renamed_2.cfr_renamed_5004(new spraen(arg0));
    }

    private /* synthetic */ void cfr_renamed_644(int arg0) {
        this.cfr_renamed_119 |= arg0;
    }

    public sprjze cfr_renamed_642(Exception arg0) throws sprahf {
        if (arg0 instanceof sprsff) {
            return this.cfr_renamed_643(2, ((sprsff)arg0).cfr_renamed_566(), arg0.getMessage());
        }
        return this.cfr_renamed_643(2, 0x40000000, arg0.getMessage());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprjze cfr_renamed_643(int n, int n2, String string) throws sprahf {
        void arg1;
        void arg0;
        this.cfr_renamed_1 = arg0;
        sprigf sprigf2 = this;
        this.cfr_renamed_2 = new sprrvm();
        this.cfr_renamed_644((int)arg1);
        if (string != null) {
            void arg2;
            this.cfr_renamed_640((String)arg2);
        }
        sprhmm sprhmm2 = this.cfr_renamed_641();
        sprsdm sprsdm2 = new sprsdm(sprhmm2, null);
        try {
            return new sprjze(sprsdm2);
        }
        catch (IOException iOException) {
            throw new sprahf(sprmxn.cfr_renamed_9("\u001a`\u001cs\rw\u001d2\u001bs\u001d~\u00002\u001f}\u000b\u007f\u0018f\rw\u001d2\u000bw\nb\u0016|\nwX"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprjze cfr_renamed_5293(sprfbf arg0, BigInteger arg1, Date arg2) throws sprahf {
        try {
            return this.cfr_renamed_5300(arg0, arg1, arg2, sprsbj.cfr_renamed_9("goMmIkApF?gtIf"));
        }
        catch (Exception exception) {
            return this.cfr_renamed_642(exception);
        }
    }

    public sprigf(sprkdf arg0, Set arg1, Set arg2) {
        this(arg0, arg1, arg2, null);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = 4 << 3 ^ 5;
        int n4 = n2;
        int n5 = (2 ^ 5) << 3 ^ 5;
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

    public sprjze cfr_renamed_5301(sprfbf arg0, BigInteger arg1, Date arg2) throws sprahf {
        return this.cfr_renamed_5300(arg0, arg1, arg2, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprjze cfr_renamed_5302(sprfbf arg0, BigInteger arg1, Date arg2, String arg3, sprhgm arg4) throws sprahf {
        sprlvm sprlvm2;
        if (arg2 == null) {
            throw new sprsff(sprmxn.cfr_renamed_9("-z\u001c2\r{\u0014wYa\u0016g\u000bq\u001c2\u0010aY|\u0016fYs\u000fs\u0010~\u0018p\u0015wW"), 512);
        }
        sprigf sprigf2 = this;
        arg0.cfr_renamed_639(sprigf2.cfr_renamed_0, sprigf2.cfr_renamed_3, this.cfr_renamed_4);
        this.cfr_renamed_1 = 0;
        sprigf sprigf3 = this;
        sprigf3.cfr_renamed_2 = new sprrvm();
        if (arg3 != null) {
            this.cfr_renamed_640(arg3);
        }
        sprhmm sprhmm2 = this.cfr_renamed_641();
        try {
            sprlvm2 = this.cfr_renamed_91.cfr_renamed_5281(arg0, arg1, arg2, arg4).cfr_renamed_637().cfr_renamed_568();
        }
        catch (sprahf sprahf2) {
            throw sprahf2;
        }
        catch (Exception exception) {
            throw new sprahf(sprsbj.cfr_renamed_9("KArMl\\~Eo\bkGtMq\bmM|Mv^zL?K~FqGk\b}M?KpFiMm\\zL?\\p\b\\Gq\\zFkaqNp"), exception);
        }
        try {
            sprco[] sprcoArray = new sprco[2];
            sprcoArray[0] = sprhmm2.cfr_renamed_119();
            sprcoArray[1] = sprlvm2.cfr_renamed_119();
            return new sprjze(new sprfdn(sprcoArray));
        }
        catch (IOException iOException) {
            throw new sprahf(sprmxn.cfr_renamed_9("\u001a`\u001cs\rw\u001d2\u001bs\u001d~\u00002\u001f}\u000b\u007f\u0018f\rw\u001d2\u000bw\nb\u0016|\nwX"));
        }
    }

    public sprjze cfr_renamed_5300(sprfbf arg0, BigInteger arg1, Date arg2, String arg3) throws sprahf {
        return this.cfr_renamed_5302(arg0, arg1, arg2, arg3, null);
    }

    private /* synthetic */ sprhmm cfr_renamed_641() {
        sprrvm sprrvm2 = new sprrvm();
        sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_1));
        if (this.cfr_renamed_2.cfr_renamed_84() > 0) {
            sprrvm2.cfr_renamed_5004(spruqm.cfr_renamed_23(new sprcen(this.cfr_renamed_2)));
        }
        if (this.cfr_renamed_119 != 0) {
            sprjye sprjye2 = new sprjye(this.cfr_renamed_119);
            sprrvm2.cfr_renamed_5004(sprjye2);
        }
        return sprhmm.cfr_renamed_23(new sprcen(sprrvm2));
    }

    public sprigf(sprkdf sprkdf2, Set set, Set set2, Set set3) {
        sprigf sprigf2 = this;
        this.cfr_renamed_91 = sprkdf2;
        this.cfr_renamed_0 = this.cfr_renamed_645(set);
        sprigf2.cfr_renamed_3 = sprigf2.cfr_renamed_645(set2);
        sprigf2.cfr_renamed_4 = sprigf2.cfr_renamed_645(set3);
        sprigf sprigf3 = this;
        sprigf3.cfr_renamed_2 = new sprrvm();
    }

    public sprigf(sprkdf arg0, Set arg1) {
        this(arg0, arg1, null, null);
    }
}


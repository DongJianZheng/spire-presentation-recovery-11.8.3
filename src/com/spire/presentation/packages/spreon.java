/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcff;
import com.spire.presentation.packages.sprclg;
import com.spire.presentation.packages.sprcqn;
import com.spire.presentation.packages.sprct;
import com.spire.presentation.packages.sprddn;
import com.spire.presentation.packages.sprdkn;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprgln;
import com.spire.presentation.packages.sprhqn;
import com.spire.presentation.packages.sprhu;
import com.spire.presentation.packages.sprlhn;
import com.spire.presentation.packages.sprlyja;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprpkn;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtzja;
import com.spire.presentation.packages.sprusca;
import com.spire.presentation.packages.spryln;
import java.util.Iterator;

@sprtea
public class spreon
implements sprhu,
Cloneable {
    private String cfr_renamed_31;
    private int cfr_renamed_272;
    public Object cfr_renamed_145;
    private long cfr_renamed_114;
    private sprdkn cfr_renamed_96;
    private String cfr_renamed_105;
    private String cfr_renamed_137;
    private String cfr_renamed_79;
    private long cfr_renamed_107;
    private long cfr_renamed_132;
    private long cfr_renamed_102;
    private String cfr_renamed_93;
    private static final sprusca cfr_renamed_86;
    private String cfr_renamed_152;
    private int cfr_renamed_112;
    private String cfr_renamed_119;
    private String cfr_renamed_91;
    private String cfr_renamed_0;
    private String cfr_renamed_1;
    private boolean cfr_renamed_2;
    private int cfr_renamed_3;
    private sprpkn cfr_renamed_4;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @sprtea
    public void cfr_renamed_12802(spreen arg0, spryln arg1) throws Exception {
        spreen spreen2 = arg0;
        spreen2.cfr_renamed_11548(spreen2.cfr_renamed_3274() + arg1.cfr_renamed_12803());
        byte[] byArray = new byte[(int)spreen2.cfr_renamed_806() - (int)(arg1.cfr_renamed_12803() & 0xFFFFFFFFL)];
        spreen2.cfr_renamed_11556(byArray, 0, byArray.length);
        spreen spreen3 = new sprpdja(byArray);
        spreen3 = sprhqn.cfr_renamed_12804(spreen3);
        spreen spreen4 = spreen3;
        try {
            byte[] byArray2 = spresca.cfr_renamed_11777(spreen3, sprpdja.class).cfr_renamed_4529();
            String string = this.cfr_renamed_12805().cfr_renamed_11595(byArray2, 0, byArray2.length);
            int n = 0;
            int n2 = 0;
            String string2 = string = string.replace("\r\n", "\n");
            while (string2.indexOf(sprclg.cfr_renamed_9("\b\u0002=\u0004 \u0014<\u0002,"), n) == n2) {
                sprgln sprgln2;
                String string3 = string;
                string2 = string3;
                n = string3.indexOf("\n", n2);
                String[] stringArray = sprraia.cfr_renamed_434(string3.substring(n2 + 10, n2 + 10 + (n - (n2 + 10))), '=');
                sprgln sprgln3 = sprgln2 = new sprgln();
                sprgln2.cfr_renamed_11640(sprraia.cfr_renamed_12806(stringArray[0]));
                sprgln3.cfr_renamed_12807(sprraia.cfr_renamed_12806(stringArray[1]).replace(sprcff.cfr_renamed_9("\u0010"), ""));
                sprgln3.cfr_renamed_11893(sprraia.cfr_renamed_12806(stringArray[1]).startsWith(sprclg.cfr_renamed_9("k")));
                arg1.cfr_renamed_82().cfr_renamed_12808(sprgln2);
                n2 = n + 1;
            }
            arg1.cfr_renamed_12809(string.substring(n2));
            if (spreen4 == null) return;
            spreen4.cfr_renamed_2637();
            return;
        }
        catch (Throwable throwable) {
            if (spreen4 == null) throw throwable;
            spreen4.cfr_renamed_2637();
            throw throwable;
        }
    }

    @sprtea
    public int cfr_renamed_12810() {
        return this.cfr_renamed_3;
    }

    @Override
    public void cfr_renamed_12811(long arg0) {
        this.cfr_renamed_102 = arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object cfr_renamed_12100() {
        try {
            return this.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException(cloneNotSupportedException);
        }
    }

    @sprtea
    public void cfr_renamed_12812(int arg0) {
        this.cfr_renamed_112 = arg0;
    }

    @sprtea
    public String cfr_renamed_12813() {
        return this.cfr_renamed_93;
    }

    @sprtea
    public void cfr_renamed_12814(spreen arg0) {
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_12815().iterator();
        while (iterator2.hasNext()) {
            ((sprcqn)iterator.next()).cfr_renamed_12816(arg0);
            iterator2 = iterator;
        }
    }

    public static long cfr_renamed_12161(spreen arg0) throws Exception {
        byte[] byArray = new byte[4];
        if (arg0.cfr_renamed_11556(byArray, 0, 4) != 4) {
            throw new Exception(sprcff.cfr_renamed_9("g\u0019S\u0015^\u0012\u0012\u0003]W@\u0012S\u0013\u0012\u0001S\u001bG\u0012\u0012\u0016FWF\u001fWWA\u0007W\u0014[\u0011[\u0012VWB\u0018A\u001eF\u001e]\u0019\u0012Z\u0012\u0012\\\u0013\u0012\u0018TWA\u0003@\u0012S\u001a\u0012\u0000S\u0004\u0012\u0005W\u0016Q\u001fW\u0013\u001c"));
        }
        return sprtzja.cfr_renamed_12136(byArray, 0);
    }

    @sprtea
    public sprszca cfr_renamed_12805() {
        return sprszca.cfr_renamed_12817(this.cfr_renamed_11859() & 0xFFFF);
    }

    @Override
    public void cfr_renamed_11640(String arg0) {
        this.cfr_renamed_152 = arg0;
    }

    @sprtea
    public void cfr_renamed_12818(spreen arg0) throws Exception {
        int n;
        int n2 = n = spreon.cfr_renamed_12168(arg0);
        while ((n2 & 0xFFFF) != 15) {
            sprcqn sprcqn2;
            int n3 = 0;
            byte[] byArray = null;
            sprcqn sprcqn3 = null;
            if ((n & 0xFFFF) == 22) {
                spreen spreen2 = arg0;
                n3 = (int)(spreon.cfr_renamed_12161(spreen2) & 0xFFFFFFFFL);
                byArray = new byte[n3];
                spreen2.cfr_renamed_11556(byArray, 0, n3);
                String string = this.cfr_renamed_12805().cfr_renamed_11595(byArray, 0, byArray.length);
                n = spreon.cfr_renamed_12168(arg0);
                if ((n & 0xFFFF) == 62) {
                    spreen spreen3 = arg0;
                    n3 = (int)(spreon.cfr_renamed_12161(spreen3) & 0xFFFFFFFFL);
                    spreen3.cfr_renamed_11548(spreen3.cfr_renamed_3274() + (long)n3);
                    n = spreon.cfr_renamed_12168(spreen3);
                }
                sprcqn2 = sprcqn3 = this.cfr_renamed_12815().cfr_renamed_12819(n & 0xFFFF);
                sprcqn3.cfr_renamed_11640(string);
            } else {
                sprcqn2 = sprcqn3 = this.cfr_renamed_12815().cfr_renamed_12819(n & 0xFFFF);
            }
            if (sprcqn2 != null) {
                sprcqn sprcqn4 = sprcqn3;
                sprcqn4.cfr_renamed_12820(this.cfr_renamed_12805());
                sprcqn4.cfr_renamed_12821(arg0);
            }
            n2 = spreon.cfr_renamed_12168(arg0);
        }
        spreen spreen4 = arg0;
        spreen4.cfr_renamed_11548(spreen4.cfr_renamed_3274() - 2L);
    }

    @Override
    public String cfr_renamed_12462() {
        return this.cfr_renamed_79;
    }

    @sprtea
    public void cfr_renamed_12822(spreen arg0) throws Exception {
        spreen spreen2 = new sprpdja();
        sprpdja sprpdja2 = spreen2;
        spreon spreon2 = this;
        spreon2.cfr_renamed_12823(spreen2);
        spreon2.cfr_renamed_12814(spreen2);
        this.cfr_renamed_12824(sprpdja2);
        sprpdja sprpdja3 = spreen2;
        ((spreen)sprpdja3).cfr_renamed_4924(sprtzja.cfr_renamed_11602(16), 0, 2);
        ((spreen)sprpdja3).cfr_renamed_4924(sprtzja.cfr_renamed_11602(0), 0, 4);
        ((spreen)sprpdja2).cfr_renamed_11548(0L);
        spreen spreen3 = spreen2 = sprhqn.cfr_renamed_12825(spresca.cfr_renamed_11777(sprpdja2, sprpdja.class));
        spreen3.cfr_renamed_11548(0L);
        byte[] byArray = spresca.cfr_renamed_11777(spreen3, sprpdja.class).cfr_renamed_4529();
        arg0.cfr_renamed_4924(byArray, 0, byArray.length);
        arg0.cfr_renamed_2947();
    }

    @sprtea
    public void cfr_renamed_12826(long arg0) {
        this.cfr_renamed_107 = arg0;
    }

    @sprtea
    public void cfr_renamed_12827(int arg0) {
        this.cfr_renamed_272 = arg0;
    }

    @sprtea
    public String cfr_renamed_1601() {
        return this.cfr_renamed_31;
    }

    @sprtea
    public void cfr_renamed_12828(String arg0) {
        this.cfr_renamed_93 = arg0;
    }

    private /* synthetic */ String cfr_renamed_12829(byte[] arg0) {
        int n;
        if (arg0 == null) {
            throw new NullPointerException("value");
        }
        if (arg0.length == 0) {
            return "";
        }
        if (arg0.length % 2 != 0) {
            throw new IllegalArgumentException("value");
        }
        int n2 = arg0.length;
        String string = "";
        int n3 = n = 0;
        while (n3 < n2) {
            Object[] objectArray = new Object[1];
            objectArray[0] = arg0[n];
            string = sprraia.cfr_renamed_11961(string, sprraia.cfr_renamed_11562(sprclg.cfr_renamed_9("\ryL1D4"), objectArray));
            n3 = ++n;
        }
        return sprraia.cfr_renamed_12830(string);
    }

    @Override
    public void cfr_renamed_12831(String arg0) {
        this.cfr_renamed_105 = arg0;
    }

    @sprtea
    public boolean cfr_renamed_12832() {
        return this.cfr_renamed_2;
    }

    static {
        String[] stringArray = new String[14];
        stringArray[0] = "ID";
        stringArray[1] = sprcff.cfr_renamed_9("b\u0016Q\u001cS\u0010W");
        stringArray[2] = sprclg.cfr_renamed_9("2&\u0015<\u001b,\u0018=");
        stringArray[3] = sprcff.cfr_renamed_9("q\u001bS\u0004A");
        stringArray[4] = sprclg.cfr_renamed_9(";&\u0012<\u001a,");
        stringArray[5] = sprcff.cfr_renamed_9("p\u0016A\u0012q\u001bS\u0004A");
        stringArray[6] = sprclg.cfr_renamed_9(">,\u001a90 \u001a,");
        stringArray[7] = "Name";
        stringArray[8] = sprcff.cfr_renamed_9("z\u0012^\u0007q\u0018\\\u0003W\u000fF>v");
        stringArray[9] = "Description";
        stringArray[10] = sprclg.cfr_renamed_9("\u001f\u0013;\u0005 \u0019'5&\u001b9\u0017=\u001f+\u001a,E{");
        stringArray[11] = sprcff.cfr_renamed_9("q:u");
        stringArray[12] = sprclg.cfr_renamed_9("\r&\u000b");
        stringArray[13] = sprcff.cfr_renamed_9("0q");
        cfr_renamed_86 = new sprusca(stringArray);
    }

    public void cfr_renamed_12833(sprct arg0) {
        this.cfr_renamed_4 = spresca.cfr_renamed_11777(arg0, sprpkn.class);
    }

    @Override
    public String cfr_renamed_313() {
        return this.cfr_renamed_152;
    }

    @sprtea
    public int cfr_renamed_2704() {
        return this.cfr_renamed_272;
    }

    @Override
    public void cfr_renamed_12834(String arg0) {
        this.cfr_renamed_137 = arg0;
    }

    @sprtea
    public void cfr_renamed_12835(long arg0) {
        this.cfr_renamed_114 = arg0;
    }

    @sprtea
    public void cfr_renamed_11638(String arg0) {
        this.cfr_renamed_31 = arg0;
    }

    @sprtea
    public spreon cfr_renamed_12836(Object arg0) throws Exception {
        spreon spreon2 = (spreon)this.cfr_renamed_12100();
        spreon2.cfr_renamed_145 = arg0;
        if (this.cfr_renamed_96 != null) {
            spreon2.cfr_renamed_96 = this.cfr_renamed_96.cfr_renamed_12837(spreon2);
        }
        if (this.cfr_renamed_4 != null) {
            spreon2.cfr_renamed_4 = this.cfr_renamed_4.cfr_renamed_12837(spreon2);
        }
        return spreon2;
    }

    private /* synthetic */ byte[] cfr_renamed_12838(String arg0) {
        int n;
        if (arg0 == null) {
            throw new NullPointerException(arg0);
        }
        if (arg0.length() == 0) {
            return new byte[0];
        }
        if (arg0.length() % 2 != 0) {
            throw new IllegalArgumentException(arg0);
        }
        int n2 = arg0.length() >> 1;
        byte[] byArray = new byte[n2];
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = n;
            byte by = sprlyja.cfr_renamed_12839(arg0.substring(n * 2, n4 * 2 + 2), 515);
            byArray[n4] = by;
            n3 = ++n;
        }
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_12492(spreen spreen2) throws Exception {
        void v2;
        void arg0;
        void v0 = arg0;
        v0.cfr_renamed_11548(6L);
        this.cfr_renamed_12840((int)(spreon.cfr_renamed_12161((spreen)v0) & 0xFFFFFFFFL));
        if ((spreon.cfr_renamed_12168((spreen)v0) & 0xFFFF) == 74) {
            void v1 = arg0;
            v2 = v1;
            v1.cfr_renamed_11548(v1.cfr_renamed_3274() + 8L);
        } else {
            void v3 = arg0;
            v2 = v3;
            v3.cfr_renamed_11548(v3.cfr_renamed_3274() - 2L);
        }
        v2.cfr_renamed_11548(arg0.cfr_renamed_3274() + 6L);
        void v4 = arg0;
        spreon spreon2 = this;
        void v6 = arg0;
        this.cfr_renamed_12835(spreon.cfr_renamed_12161((spreen)v6));
        v6.cfr_renamed_11548(arg0.cfr_renamed_3274() + 6L);
        spreon2.cfr_renamed_12826(spreon.cfr_renamed_12161((spreen)v6));
        v4.cfr_renamed_11548(arg0.cfr_renamed_3274() + 6L);
        spreon2.cfr_renamed_12812(spreon.cfr_renamed_12168((spreen)v4));
        byte[] byArray = null;
        void v7 = arg0;
        v7.cfr_renamed_11548(v7.cfr_renamed_3274() + 2L);
        int n = (int)(spreon.cfr_renamed_12161((spreen)v7) & 0xFFFFFFFFL);
        byArray = new byte[n];
        spreon spreon3 = this;
        v7.cfr_renamed_11556(byArray, 0, n);
        sprszca sprszca2 = spreon3.cfr_renamed_12805();
        spreon3.cfr_renamed_11640(sprszca2.cfr_renamed_11595(byArray, 0, byArray.length));
        void v9 = arg0;
        v9.cfr_renamed_11548(v9.cfr_renamed_3274() + 2L);
        n = (int)(spreon.cfr_renamed_12161((spreen)v9) & 0xFFFFFFFFL);
        v9.cfr_renamed_11548(v9.cfr_renamed_3274() + (long)n);
        v9.cfr_renamed_11548(v9.cfr_renamed_3274() + 2L);
        n = (int)(spreon.cfr_renamed_12161((spreen)v9) & 0xFFFFFFFFL);
        byArray = new byte[n];
        v9.cfr_renamed_11556(byArray, 0, n);
        this.cfr_renamed_12841(sprszca.cfr_renamed_12801().cfr_renamed_11595(byArray, 0, byArray.length));
        void v10 = arg0;
        v10.cfr_renamed_11548(v10.cfr_renamed_3274() + 2L);
        n = (int)(spreon.cfr_renamed_12161((spreen)v10) & 0xFFFFFFFFL);
        byArray = new byte[n];
        v10.cfr_renamed_11556(byArray, 0, n);
        this.cfr_renamed_12834(sprszca2.cfr_renamed_11595(byArray, 0, byArray.length));
        void v11 = arg0;
        v11.cfr_renamed_11548(v11.cfr_renamed_3274() + 2L);
        n = (int)(spreon.cfr_renamed_12161((spreen)v11) & 0xFFFFFFFFL);
        byArray = new byte[n];
        v11.cfr_renamed_11556(byArray, 0, n);
        this.cfr_renamed_12842(sprszca2.cfr_renamed_11595(byArray, 0, byArray.length));
        void v12 = arg0;
        void v13 = arg0;
        void v14 = arg0;
        void v15 = arg0;
        v15.cfr_renamed_11548(v15.cfr_renamed_3274() + 6L);
        this.cfr_renamed_12811(spreon.cfr_renamed_12161((spreen)v14));
        v14.cfr_renamed_11548(v13.cfr_renamed_3274() + 10L);
        v12.cfr_renamed_11548(v13.cfr_renamed_3274() + 6L);
        this.cfr_renamed_12843(spreon.cfr_renamed_12161((spreen)arg0));
        this.cfr_renamed_12827(spreon.cfr_renamed_12168((spreen)v12));
        if ((sprddn.cfr_renamed_12168((spreen)v12) & 0xFFFF) == 12) {
            void v16 = arg0;
            n = (int)(spreon.cfr_renamed_12161((spreen)v16) & 0xFFFFFFFFL);
            byArray = new byte[n];
            v16.cfr_renamed_11556(byArray, 0, n);
            this.cfr_renamed_12831(sprszca2.cfr_renamed_11595(byArray, 0, byArray.length));
            void v17 = arg0;
            v17.cfr_renamed_11548(v17.cfr_renamed_3274() + 2L);
            n = (int)(spreon.cfr_renamed_12161((spreen)v17) & 0xFFFFFFFFL);
            v17.cfr_renamed_11548(v17.cfr_renamed_3274() + (long)n);
            return;
        }
        void v18 = arg0;
        v18.cfr_renamed_11548(v18.cfr_renamed_3274() - 2L);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @sprtea
    public void cfr_renamed_12844(spreen arg0) throws Exception {
        spreen spreen2 = arg0 = sprhqn.cfr_renamed_12804(arg0);
        try {
            spreen spreen3 = arg0;
            spreen spreen4 = arg0;
            arg0.cfr_renamed_11548(0L);
            this.cfr_renamed_12492(arg0);
            this.cfr_renamed_12818(spreen4);
            spreen4.cfr_renamed_11548(spreen3.cfr_renamed_3274() + 6L);
            int n = sprddn.cfr_renamed_12168(spreen3);
            spreen3.cfr_renamed_11548(spreen3.cfr_renamed_3274() + 8L);
            int n2 = n;
            while ((n2 & 0xFFFF) > 0) {
                spryln spryln2 = new spryln(spresca.cfr_renamed_11777(this.cfr_renamed_12845(), sprpkn.class));
                spryln2.cfr_renamed_12846(arg0);
                spresca.cfr_renamed_11777(this.cfr_renamed_12845(), sprpkn.class).cfr_renamed_12808(spryln2);
                n2 = --n;
            }
            spreen spreen5 = arg0;
            spreen5.cfr_renamed_11548(spreen5.cfr_renamed_3274() + 6L);
            if (spreen2 == null) return;
            spreen2.cfr_renamed_2637();
            return;
        }
        catch (Throwable throwable) {
            if (spreen2 == null) throw throwable;
            spreen2.cfr_renamed_2637();
            throw throwable;
        }
    }

    @sprtea
    public void cfr_renamed_12843(long arg0) {
        this.cfr_renamed_132 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_12824(spreen spreen2) throws Exception {
        void arg0;
        void v0 = arg0;
        void v1 = arg0;
        arg0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(15), 0, 2);
        v1.cfr_renamed_4924(sprtzja.cfr_renamed_11602(2), 0, 4);
        v0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(this.cfr_renamed_4.cfr_renamed_11861()), 0, 2);
        long l = v1.cfr_renamed_3274() - 2L;
        v0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(19), 0, 2);
        v0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(2), 0, 4);
        v0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(65535), 0, 2);
        int n = this.cfr_renamed_4.cfr_renamed_11861();
        for (spryln spryln2 : this.cfr_renamed_4) {
            if (spryln2.cfr_renamed_324() == sprlhn.cfr_renamed_3 && spryln2.cfr_renamed_12847() == null) {
                void v2 = arg0;
                long l2 = v2.cfr_renamed_3274();
                v2.cfr_renamed_11548(l);
                v2.cfr_renamed_4924(sprtzja.cfr_renamed_11602(--n), 0, 2);
                v2.cfr_renamed_11548(l2);
                continue;
            }
            spryln2.cfr_renamed_12848((spreen)arg0);
        }
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_12849(spreen spreen2) {
        void arg0;
        void v0 = arg0;
        void v1 = arg0;
        v1.cfr_renamed_4924(sprtzja.cfr_renamed_11602(25036), 0, 2);
        v1.cfr_renamed_4924(sprtzja.cfr_renamed_11602(65535), 0, 2);
        v0.cfr_renamed_11594((byte)0);
        v0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(0), 0, 2);
        v0.cfr_renamed_2947();
    }

    @sprtea
    public void cfr_renamed_12850(spreen arg0) throws Exception {
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_4.iterator();
        while (iterator2.hasNext()) {
            spryln spryln2 = (spryln)iterator.next();
            if (spryln2.cfr_renamed_324() == sprlhn.cfr_renamed_3 && spryln2.cfr_renamed_12847() == null) {
                iterator2 = iterator;
                continue;
            }
            byte[] byArray = this.cfr_renamed_12805().cfr_renamed_11606(new StringBuilder().insert(0, spryln2.cfr_renamed_313()).append(sprclg.cfr_renamed_9("I")).toString());
            arg0.cfr_renamed_4924(byArray, 0, byArray.length);
            byArray = sprszca.cfr_renamed_12801().cfr_renamed_11606(new StringBuilder().insert(0, spryln2.cfr_renamed_313()).append(sprcff.cfr_renamed_9("2")).toString());
            arg0.cfr_renamed_4924(byArray, 0, byArray.length);
            iterator2 = iterator;
        }
        spreen spreen2 = arg0;
        spreen2.cfr_renamed_4924(sprtzja.cfr_renamed_11602(0), 0, 2);
        spreen2.cfr_renamed_2947();
    }

    @Override
    public long cfr_renamed_12851() {
        return this.cfr_renamed_102;
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public void cfr_renamed_12852(spreen arg0) {
        int n;
        spreen spreen2 = arg0;
        byte[] byArray = new byte[(int)spreen2.cfr_renamed_806()];
        spreen2.cfr_renamed_11556(byArray, 0, byArray.length);
        String[] stringArray = new String[1];
        stringArray[0] = "\r\n";
        String[] stringArray2 = sprraia.cfr_renamed_12853(this.cfr_renamed_12805().cfr_renamed_11595(byArray, 0, byArray.length), stringArray, 0);
        String string = null;
        spryln spryln2 = null;
        String[] stringArray3 = stringArray2;
        int n2 = stringArray2.length;
        int n3 = n = 0;
        while (n3 < n2) {
            String string2 = stringArray3[n];
            String[] stringArray4 = sprraia.cfr_renamed_434(string2, '=');
            stringArray4[0] = stringArray4[0].replace(sprclg.cfr_renamed_9("k"), "");
            switch (cfr_renamed_86.cfr_renamed_12854(stringArray4[0])) {
                case 0: {
                    this.cfr_renamed_93 = stringArray4[1].replace(sprcff.cfr_renamed_9("\u0010"), "");
                    break;
                }
                case 1: {
                    string = stringArray4[1].replace(sprclg.cfr_renamed_9("k"), "");
                    break;
                }
                case 2: {
                    spryln2 = spresca.cfr_renamed_11777(this.cfr_renamed_4.cfr_renamed_1600(stringArray4[1].substring(0, 0 + stringArray4[1].indexOf(sprcff.cfr_renamed_9("\u001dQz")))), spryln.class);
                    if (spryln2 == null) break;
                    spryln2.cfr_renamed_12855(sprlhn.cfr_renamed_2);
                    break;
                }
                case 3: {
                    spryln2 = spresca.cfr_renamed_11777(this.cfr_renamed_4.cfr_renamed_1600(stringArray4[1]), spryln.class);
                    if (spryln2 == null) break;
                    spryln2.cfr_renamed_12855(sprlhn.cfr_renamed_119);
                    break;
                }
                case 4: {
                    spryln2 = spresca.cfr_renamed_11777(this.cfr_renamed_4.cfr_renamed_1600(stringArray4[1]), spryln.class);
                    if (spryln2 == null) break;
                    spryln2.cfr_renamed_12855(sprlhn.cfr_renamed_4);
                    break;
                }
                case 5: {
                    spryln2 = spresca.cfr_renamed_11777(this.cfr_renamed_4.cfr_renamed_1600(stringArray4[1]), spryln.class);
                    if (spryln2 == null) break;
                    spryln spryln3 = spryln2;
                    spryln3.cfr_renamed_12855(sprlhn.cfr_renamed_3);
                    spryln3.cfr_renamed_12856(string);
                    break;
                }
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: {
                    break;
                }
                case 11: {
                    this.cfr_renamed_119 = string2;
                    break;
                }
                case 12: {
                    this.cfr_renamed_1 = string2;
                    break;
                }
                case 13: {
                    this.cfr_renamed_91 = string2;
                    break;
                }
            }
            n3 = ++n;
        }
        return;
    }

    public static int cfr_renamed_12168(spreen arg0) throws Exception {
        byte[] byArray = new byte[2];
        if (arg0.cfr_renamed_11556(byArray, 0, 2) != 2) {
            throw new Exception(sprclg.cfr_renamed_9("\u001c\u0018(\u0014%\u0013i\u0002&V;\u0013(\u0012i\u0000(\u001a<\u0013i\u0017=V=\u001e,V:\u0006,\u0015 \u0010 \u0013-V9\u0019:\u001f=\u001f&\u0018i[i\u0013'\u0012i\u0019/V:\u0002;\u0013(\u001bi\u0001(\u0005i\u0004,\u0017*\u001e,\u0012g"));
        }
        return sprtzja.cfr_renamed_12169(byArray, 0);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_12823(spreen spreen2) throws Exception {
        void arg0;
        void v0 = arg0;
        void v1 = arg0;
        void v2 = arg0;
        void v3 = arg0;
        void v4 = arg0;
        void v5 = arg0;
        arg0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(1), 0, 2);
        v5.cfr_renamed_4924(sprtzja.cfr_renamed_11602(4), 0, 4);
        v5.cfr_renamed_4924(sprtzja.cfr_renamed_11602(this.cfr_renamed_3), 0, 4);
        v4.cfr_renamed_4924(sprtzja.cfr_renamed_11602(2), 0, 2);
        v4.cfr_renamed_4924(sprtzja.cfr_renamed_11602(4), 0, 4);
        v3.cfr_renamed_4924(sprtzja.cfr_renamed_11602(1033), 0, 4);
        v3.cfr_renamed_4924(sprtzja.cfr_renamed_11602(20), 0, 2);
        v2.cfr_renamed_4924(sprtzja.cfr_renamed_11602(4), 0, 4);
        v2.cfr_renamed_4924(sprtzja.cfr_renamed_11602(1033), 0, 4);
        v1.cfr_renamed_4924(sprtzja.cfr_renamed_11602(3), 0, 2);
        v1.cfr_renamed_4924(sprtzja.cfr_renamed_11602(2), 0, 4);
        v0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(this.cfr_renamed_11859()), 0, 2);
        byte[] byArray = this.cfr_renamed_12805().cfr_renamed_11606(this.cfr_renamed_313());
        v0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(4), 0, 2);
        v0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(byArray.length), 0, 4);
        arg0.cfr_renamed_4924(byArray, 0, byArray.length);
        byArray = this.cfr_renamed_12805().cfr_renamed_11606(this.cfr_renamed_12462());
        void v6 = arg0;
        v6.cfr_renamed_4924(sprtzja.cfr_renamed_11602(5), 0, 2);
        v6.cfr_renamed_4924(sprtzja.cfr_renamed_11602(byArray.length), 0, 4);
        arg0.cfr_renamed_4924(byArray, 0, byArray.length);
        byArray = sprszca.cfr_renamed_12801().cfr_renamed_11606(this.cfr_renamed_12462());
        void v7 = arg0;
        v7.cfr_renamed_4924(sprtzja.cfr_renamed_11602(64), 0, 2);
        v7.cfr_renamed_4924(sprtzja.cfr_renamed_11602(byArray.length), 0, 4);
        arg0.cfr_renamed_4924(byArray, 0, byArray.length);
        byArray = this.cfr_renamed_12805().cfr_renamed_11606(this.cfr_renamed_137);
        void v8 = arg0;
        v8.cfr_renamed_4924(sprtzja.cfr_renamed_11602(6), 0, 2);
        v8.cfr_renamed_4924(sprtzja.cfr_renamed_11602(byArray.length), 0, 4);
        arg0.cfr_renamed_4924(byArray, 0, byArray.length);
        byArray = sprszca.cfr_renamed_12801().cfr_renamed_11606(this.cfr_renamed_0);
        void v9 = arg0;
        v9.cfr_renamed_4924(sprtzja.cfr_renamed_11602(61), 0, 2);
        v9.cfr_renamed_4924(sprtzja.cfr_renamed_11602(byArray.length), 0, 4);
        arg0.cfr_renamed_4924(byArray, 0, byArray.length);
        spreon spreon2 = this;
        void v11 = arg0;
        void v12 = arg0;
        void v13 = arg0;
        void v14 = arg0;
        arg0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(7), 0, 2);
        v14.cfr_renamed_4924(sprtzja.cfr_renamed_11602(4), 0, 4);
        v14.cfr_renamed_4924(sprtzja.cfr_renamed_11787(this.cfr_renamed_12851()), 0, 4);
        v13.cfr_renamed_4924(sprtzja.cfr_renamed_11602(8), 0, 2);
        v13.cfr_renamed_4924(sprtzja.cfr_renamed_11602(4), 0, 4);
        v12.cfr_renamed_4924(sprtzja.cfr_renamed_11602(0), 0, 4);
        v12.cfr_renamed_4924(sprtzja.cfr_renamed_11602(9), 0, 2);
        v11.cfr_renamed_4924(sprtzja.cfr_renamed_11602(4), 0, 4);
        v11.cfr_renamed_4924(sprtzja.cfr_renamed_11787(this.cfr_renamed_2703()), 0, 4);
        arg0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(spreon2.cfr_renamed_2704()), 0, 2);
        if (!sprraia.cfr_renamed_12280(spreon2.cfr_renamed_12857())) {
            byArray = this.cfr_renamed_12805().cfr_renamed_11606(this.cfr_renamed_12857());
            if (byArray.length > 1015) {
                throw new Exception(sprcff.cfr_renamed_9("4]\u0019A\u0003S\u0019F\u0004\u0012\u001bW\u0019U\u0003ZWA\u001f]\u0002^\u0013\u0012\u0015WW^\u0012A\u0004\u0012\u0003Z\u0016\\W]\u0005\u0012\u0012C\u0002S\u001b\u0012\u0003]W\u0003G\u0003B\u0012\u0014Z\u0016@\u0016Q\u0003W\u0005A"));
            }
            arg0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(12), 0, 2);
            arg0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(byArray.length), 0, 4);
            arg0.cfr_renamed_4924(byArray, 0, byArray.length);
            byArray = sprszca.cfr_renamed_12801().cfr_renamed_11606(this.cfr_renamed_12857());
            void v15 = arg0;
            v15.cfr_renamed_4924(sprtzja.cfr_renamed_11602(60), 0, 2);
            v15.cfr_renamed_4924(sprtzja.cfr_renamed_11602(byArray.length), 0, 4);
            arg0.cfr_renamed_4924(byArray, 0, byArray.length);
        }
    }

    @sprtea
    public sprdkn cfr_renamed_12815() {
        if (this.cfr_renamed_96 == null) {
            spreon spreon2 = this;
            spreon2.cfr_renamed_96 = new sprdkn();
        }
        return this.cfr_renamed_96;
    }

    @Override
    public String cfr_renamed_12858() {
        return this.cfr_renamed_137;
    }

    @sprtea
    public long cfr_renamed_2703() {
        return this.cfr_renamed_132;
    }

    @sprtea
    public String cfr_renamed_12859() {
        return this.cfr_renamed_0;
    }

    @Override
    public sprct cfr_renamed_12845() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public void cfr_renamed_12842(String arg0) {
        this.cfr_renamed_0 = arg0;
    }

    @sprtea
    public long cfr_renamed_12860() {
        return this.cfr_renamed_114;
    }

    @sprtea
    public long cfr_renamed_12861() {
        return this.cfr_renamed_107;
    }

    @Override
    public void cfr_renamed_12841(String arg0) {
        this.cfr_renamed_79 = arg0;
    }

    public static short cfr_renamed_12116(spreen arg0) throws Exception {
        byte[] byArray = new byte[2];
        if (arg0.cfr_renamed_11556(byArray, 0, 2) != 2) {
            throw new Exception(sprclg.cfr_renamed_9("\u001c\u0018(\u0014%\u0013i\u0002&V;\u0013(\u0012i\u0000(\u001a<\u0013i\u0017=V=\u001e,V:\u0006,\u0015 \u0010 \u0013-V9\u0019:\u001f=\u001f&\u0018i[i\u0013'\u0012i\u0019/V:\u0002;\u0013(\u001bi\u0001(\u0005i\u0004,\u0017*\u001e,\u0012g"));
        }
        return (short)sprtzja.cfr_renamed_12176(byArray, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public void cfr_renamed_12862(spreen arg0) throws Exception {
        spryln spryln2;
        String string = null;
        string = sprraia.cfr_renamed_11961(string, sprcff.cfr_renamed_9(">vJ\u0010") + this.cfr_renamed_93 + sprclg.cfr_renamed_9("k{C"));
        Object object = this.cfr_renamed_4.iterator();
        block6: while (true) {
            Iterator iterator = object;
            while (iterator.hasNext()) {
                spryln2 = (spryln)object.next();
                if (spryln2.cfr_renamed_324() == sprlhn.cfr_renamed_3 && spryln2.cfr_renamed_12847() == null) {
                    iterator = object;
                    continue;
                }
                switch (spryln2.cfr_renamed_324().cfr_renamed_97()) {
                    case 1: {
                        string = sprraia.cfr_renamed_11961(string, new StringBuilder().insert(0, sprcff.cfr_renamed_9("4^\u0016A\u0004\u000f")).append(spryln2.cfr_renamed_313()).append("\r\n").toString());
                        break;
                    }
                    case 0: {
                        string = sprraia.cfr_renamed_11961(string, new StringBuilder().insert(0, sprclg.cfr_renamed_9("\u0004\u0019-\u0003%\u0013t")).append(spryln2.cfr_renamed_313()).append("\r\n").toString());
                        break;
                    }
                    case 2: {
                        if (!sprraia.cfr_renamed_12280(spryln2.cfr_renamed_12863())) {
                            string = sprraia.cfr_renamed_11961(string, new StringBuilder().insert(0, sprcff.cfr_renamed_9("'S\u0014Y\u0016U\u0012\u000f")).append(spryln2.cfr_renamed_12863()).append("\r\n").toString());
                        }
                        string = sprraia.cfr_renamed_11961(string, new StringBuilder().insert(0, sprclg.cfr_renamed_9("4(\u0005,5%\u0017:\u0005t")).append(spryln2.cfr_renamed_313()).append("\r\n").toString());
                        break;
                    }
                    case 3: {
                        string = sprraia.cfr_renamed_11961(string, new StringBuilder().insert(0, sprcff.cfr_renamed_9("v\u0018Q\u0002_\u0012\\\u0003\u000f")).append(spryln2.cfr_renamed_313()).append(sprclg.cfr_renamed_9("fP\u0001FyFyFyFy{C")).toString());
                        break;
                    }
                }
                continue block6;
            }
            break;
        }
        if (!sprraia.cfr_renamed_12280(this.cfr_renamed_12858())) {
            string = sprraia.cfr_renamed_11961(string, new StringBuilder().insert(0, sprcff.cfr_renamed_9("?W\u001bB1[\u001bWJ\u0010")).append(this.cfr_renamed_12858()).append(sprclg.cfr_renamed_9("k{C")).toString());
        }
        string = sprraia.cfr_renamed_11961(string, new StringBuilder().insert(0, sprcff.cfr_renamed_9("9S\u001aWJ\u0010")).append(this.cfr_renamed_313()).append(sprclg.cfr_renamed_9("k{C")).toString());
        string = sprraia.cfr_renamed_11961(string, new StringBuilder().insert(0, sprcff.cfr_renamed_9("?W\u001bB4]\u0019F\u0012J\u0003{3\u000f")).append(this.cfr_renamed_12851() & 0xFFFFFFFFL).append("\r\n").toString());
        if (!sprraia.cfr_renamed_12280(this.cfr_renamed_12462())) {
            string = sprraia.cfr_renamed_11961(string, new StringBuilder().insert(0, sprclg.cfr_renamed_9("\r\u0013:\u0015;\u001f9\u0002 \u0019'Kk")).append(this.cfr_renamed_12462()).append(sprcff.cfr_renamed_9("\u0010z8")).toString());
        }
        string = sprraia.cfr_renamed_11961(string, sprclg.cfr_renamed_9("\u001f\u0013;\u0005 \u0019'5&\u001b9\u0017=\u001f+\u001a,E{KkEpE{D{FyFk{C"));
        if (!sprraia.cfr_renamed_12280(this.cfr_renamed_119)) {
            string = sprraia.cfr_renamed_11961(string, new StringBuilder().insert(0, this.cfr_renamed_119).append("\r\n").toString());
        }
        if (!sprraia.cfr_renamed_12280(this.cfr_renamed_1)) {
            string = sprraia.cfr_renamed_11961(string, new StringBuilder().insert(0, this.cfr_renamed_1).append("\r\n").toString());
        }
        if (!sprraia.cfr_renamed_12280(this.cfr_renamed_91)) {
            string = sprraia.cfr_renamed_11961(string, new StringBuilder().insert(0, this.cfr_renamed_91).append("\r\n").toString());
        }
        string = sprraia.cfr_renamed_11961(string, "\r\n");
        string = sprraia.cfr_renamed_11961(string, sprcff.cfr_renamed_9(",z\u0018A\u0003\u00122J\u0003W\u0019V\u0012@W{\u0019T\u0018oz8"));
        string = sprraia.cfr_renamed_11961(string, sprclg.cfr_renamed_9("P\u0001FyFyFyFxK2EqE{2\u007fBy[\n0pFdGx5\u000f[q3}EdFy7y5pGxFyC\b\u000br \u000b3rP\u0001FyFyFyFy{C"));
        string = sprraia.cfr_renamed_11961(string, "\r\n");
        string = sprraia.cfr_renamed_11961(string, sprcff.cfr_renamed_9("i ]\u0005Y\u0004B\u0016Q\u0012oz8"));
        Object object2 = object = this.cfr_renamed_4.iterator();
        while (true) {
            if (!object2.hasNext()) {
                Object object3 = object = (Object)this.cfr_renamed_12805().cfr_renamed_11606(string);
                arg0.cfr_renamed_4924((byte[])object3, 0, ((Object)object3).length);
                arg0.cfr_renamed_2947();
                return;
            }
            spryln2 = (spryln)object.next();
            if (spryln2.cfr_renamed_324() == sprlhn.cfr_renamed_3 && spryln2.cfr_renamed_12847() == null) {
                object2 = object;
                continue;
            }
            string = sprraia.cfr_renamed_11961(string, new StringBuilder().insert(0, spryln2.cfr_renamed_313()).append(sprclg.cfr_renamed_9("tFeVyZiFeVyZi5i{C")).toString());
            object2 = object;
        }
    }

    @sprtea
    public void cfr_renamed_12840(int arg0) {
        this.cfr_renamed_3 = arg0;
    }

    @sprtea
    public void cfr_renamed_12864(boolean arg0) {
        this.cfr_renamed_2 = arg0;
    }

    @Override
    public String cfr_renamed_12857() {
        return this.cfr_renamed_105;
    }

    @sprtea
    public int cfr_renamed_11859() {
        return this.cfr_renamed_112;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public spreon(Object object) {
        void arg0;
        spreon spreon2 = this;
        spreon spreon3 = this;
        spreon spreon4 = this;
        spreon spreon5 = this;
        spreon spreon6 = this;
        spreon6.cfr_renamed_145 = arg0;
        spreon6.cfr_renamed_152 = "VBAProject";
        spreon5.cfr_renamed_114 = 1033L;
        spreon5.cfr_renamed_107 = 1033L;
        spreon4.cfr_renamed_112 = 1252;
        spreon4.cfr_renamed_272 = 3;
        spreon3.cfr_renamed_132 = 1602932494L;
        spreon3.cfr_renamed_93 = "{EE89B4E9-F8E5-45FE-9D4D-0A42D7254B84}";
        this.cfr_renamed_3 = 1;
        this.cfr_renamed_12841("");
        spreon2.cfr_renamed_12834("");
        spreon2.cfr_renamed_12842("");
        spreon spreon7 = this;
        spreon2.cfr_renamed_4 = new sprpkn(this);
    }

    @sprtea
    public void cfr_renamed_12865(spryln arg0, spreen arg1) {
        Object object;
        String string = "";
        Object object2 = object = arg0.cfr_renamed_82().iterator();
        while (object2.hasNext()) {
            sprgln sprgln2 = (sprgln)object.next();
            string = sprraia.cfr_renamed_11961(string, sprcff.cfr_renamed_9("6F\u0003@\u001eP\u0002F\u0012\u0012") + sprgln2.cfr_renamed_313() + sprclg.cfr_renamed_9("iKi"));
            string = sprraia.cfr_renamed_11961(sprgln2.cfr_renamed_11946() ? (string = sprraia.cfr_renamed_11961(string, new StringBuilder().insert(0, sprcff.cfr_renamed_9("\u0010")).append(sprgln2.cfr_renamed_97()).append(sprclg.cfr_renamed_9("k")).toString())) : (string = sprraia.cfr_renamed_11961(string, sprgln2.cfr_renamed_97())), "\r\n");
            object2 = object;
        }
        string = sprraia.cfr_renamed_11961(string, arg0.cfr_renamed_12866());
        object = this.cfr_renamed_12805().cfr_renamed_11606(string);
        Object object3 = object = (Object)spresca.cfr_renamed_11777(sprhqn.cfr_renamed_12825(new sprpdja((byte[])object)), sprpdja.class).cfr_renamed_4529();
        arg1.cfr_renamed_4924((byte[])object3, 0, ((Object)object3).length);
        arg1.cfr_renamed_2947();
    }

    @sprtea
    public void cfr_renamed_11665() {
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4.cfr_renamed_11665();
            this.cfr_renamed_4 = null;
        }
        if (this.cfr_renamed_96 != null) {
            this.cfr_renamed_96.cfr_renamed_11665();
            this.cfr_renamed_96 = null;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraco;
import com.spire.presentation.packages.spredo;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprfdo;
import com.spire.presentation.packages.sprkwe;
import com.spire.presentation.packages.sprlgo;
import com.spire.presentation.packages.sprlhz;
import com.spire.presentation.packages.sprmco;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprsfp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtq;
import com.spire.presentation.packages.sprtyo;
import com.spire.presentation.packages.sprudl;
import com.spire.presentation.packages.sprueka;
import com.spire.presentation.packages.sprwdda;
import java.io.FileNotFoundException;
import java.util.Iterator;

@sprtea
public class sprtsn {
    private sprtsn cfr_renamed_86;
    private sprtq<String, sprnco> cfr_renamed_152;
    private sprtq cfr_renamed_112;
    public sprmco cfr_renamed_119;
    private String cfr_renamed_91;
    private String cfr_renamed_0;
    private sprtq<String, byte[]> cfr_renamed_1;
    private sprtq cfr_renamed_2;
    private String cfr_renamed_3;
    private sprudl cfr_renamed_4;

    public sprtsn cfr_renamed_15320(String arg0) throws Exception {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            return this;
        }
        sprnco sprnco2 = this.cfr_renamed_152.cfr_renamed_12347(arg0);
        if (sprnco2 != null && this.cfr_renamed_15322(arg0, sprnco2)) {
            this.cfr_renamed_119.cfr_renamed_15315(sprnco2, arg0);
        }
        return this;
    }

    public sprtsn cfr_renamed_15323(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            return this;
        }
        sprtsn sprtsn2 = (sprtsn)this.cfr_renamed_2.cfr_renamed_12347(arg0);
        if (sprtsn2 != null) {
            sprtsn2.cfr_renamed_11665();
        }
        return this;
    }

    public spreen cfr_renamed_15324(String arg0) throws Exception {
        arg0 = arg0.toLowerCase();
        for (sprfdo sprfdo2 : this.cfr_renamed_119.cfr_renamed_15309()) {
            String string = sprfdo2.cfr_renamed_8433().toLowerCase();
            if (!string.equals(arg0)) {
                char[] cArray = new char[1];
                cArray[0] = 47;
                if (!string.equals(sprraia.cfr_renamed_15325(arg0, cArray))) continue;
            }
            return sprfdo2.cfr_renamed_13232();
        }
        throw new FileNotFoundException(new StringBuilder().insert(0, arg0).append(sprkwe.cfr_renamed_9("\u6262\u4e4d\u522c\uff41")).toString());
    }

    public Object cfr_renamed_15326(String arg0, Object arg1) {
        if (sprriia.cfr_renamed_15321(arg0 = this.cfr_renamed_15327(arg0), null) || arg0.length() == 0) {
            throw new IllegalArgumentException(sprlhz.cfr_renamed_9("\u5be2\u5655\u5456\u79cd\uff53S:P>\uff34\u4e61\u7a47"));
        }
        if (arg1 == null) {
            throw new IllegalArgumentException(sprkwe.cfr_renamed_9("\u5ba5\u5628\u6798\u5eba\u5be5\u8c21\uff14-}0l%n\uff49\u4e26\u7a3a"));
        }
        sprtsn sprtsn2 = this.cfr_renamed_15328(arg0);
        if (sprtsn2 == null) {
            ((sprtsn)arg1).cfr_renamed_15329(this);
            Object object = arg1;
            this.cfr_renamed_2.cfr_renamed_13301(arg0, object);
            return object;
        }
        return sprtsn2;
    }

    public void cfr_renamed_15329(sprtsn arg0) {
        this.cfr_renamed_86 = arg0;
    }

    public void cfr_renamed_2947() throws Exception {
        Object object;
        String string;
        for (sprueka object22 : this.cfr_renamed_152) {
            string = (String)object22.cfr_renamed_1521();
            if (!this.cfr_renamed_15322(string, (sprnco)(object = (sprnco)object22.cfr_renamed_97()))) continue;
            this.cfr_renamed_119.cfr_renamed_15315((sprnco)object, string);
        }
        Iterator iterator = this.cfr_renamed_1.iterator();
        Iterator iterator2 = iterator;
        while (iterator2.hasNext()) {
            sprueka sprueka2 = (sprueka)iterator.next();
            string = (String)sprueka2.cfr_renamed_1521();
            object = (byte[])sprueka2.cfr_renamed_97();
            iterator2 = iterator;
            this.cfr_renamed_119.cfr_renamed_15307((byte[])object, string);
        }
        iterator = this.cfr_renamed_2.cfr_renamed_205().iterator();
        Iterator iterator3 = iterator;
        while (iterator3.hasNext()) {
            sprtsn sprtsn2 = (sprtsn)iterator.next();
            iterator3 = iterator;
            sprtsn2.cfr_renamed_2947();
        }
        sprtsn sprtsn3 = this;
        sprtsn3.cfr_renamed_152.clear();
        sprtsn3.cfr_renamed_2.clear();
    }

    public sprtsn cfr_renamed_15330(String arg0, sprnco arg1) {
        if (sprriia.cfr_renamed_15321(arg0 = this.cfr_renamed_15247(arg0), null) || arg0.length() == 0) {
            throw new IllegalArgumentException(sprlhz.cfr_renamed_9("\u65ba\u4ead\u5430\u4e56\u80c0\u4e61\u7a47"));
        }
        if (arg1 == null) {
            return this;
        }
        sprtsn sprtsn2 = this;
        sprtsn2.cfr_renamed_152.cfr_renamed_13301(arg0, arg1);
        return sprtsn2;
    }

    public sprtsn cfr_renamed_15331(byte[] arg0, String arg1) {
        if (arg0 == null) {
            return this;
        }
        sprtsn sprtsn2 = this;
        sprtsn sprtsn3 = this;
        sprtsn sprtsn4 = this;
        sprtsn2.cfr_renamed_1.cfr_renamed_12160(sprtsn4.cfr_renamed_15327(sprtsn4.cfr_renamed_15248() + '/' + arg1), arg0);
        return sprtsn2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_11665() {
        try {
            this.cfr_renamed_2947();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public boolean cfr_renamed_15332(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || arg0.length() == 0) {
            return false;
        }
        if (this.cfr_renamed_152.cfr_renamed_12347(arg0) != null) {
            return true;
        }
        return this.cfr_renamed_15333(arg0) != null;
    }

    public String cfr_renamed_15334() {
        return this.cfr_renamed_3;
    }

    public Object cfr_renamed_15335(String arg0, Object arg1) {
        if (this.cfr_renamed_2.cfr_renamed_12143(arg0)) {
            return (sprtsn)this.cfr_renamed_2.cfr_renamed_12347(arg0);
        }
        ((sprtsn)arg1).cfr_renamed_15329(this);
        Object object = arg1;
        this.cfr_renamed_2.cfr_renamed_13301(arg0, object);
        return object;
    }

    private /* synthetic */ sprtsn cfr_renamed_15328(String arg0) {
        if (this.cfr_renamed_2.cfr_renamed_12143(arg0)) {
            return (sprtsn)this.cfr_renamed_2.cfr_renamed_12347(arg0);
        }
        return null;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = 5 << 3 ^ 5;
        int n4 = n2;
        int n5 = 3 << 3 ^ 2;
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

    public spreen cfr_renamed_15333(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || arg0.length() == 0) {
            throw new IllegalArgumentException(sprkwe.cfr_renamed_9("\u65c7\u4eea\u544d\u4e26\u7a3a"));
        }
        for (sprfdo sprfdo2 : this.cfr_renamed_119.cfr_renamed_15309()) {
            if (!sprfdo2.cfr_renamed_313().equals(arg0)) continue;
            return sprfdo2.cfr_renamed_13232();
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprtsn(String string, sprtsn sprtsn2) {
        void arg0;
        void arg1;
        if (sprtsn2 != null) {
            this.cfr_renamed_119 = arg1.cfr_renamed_119;
        }
        sprtsn sprtsn3 = this;
        sprtsn3.cfr_renamed_0 = arg0;
        sprtsn3.cfr_renamed_86 = arg1;
        this.cfr_renamed_1391();
    }

    private /* synthetic */ boolean cfr_renamed_15322(String arg0, sprnco arg1) throws Exception {
        if (this.cfr_renamed_4 == null) {
            return true;
        }
        byte[] byArray = (byte[])this.cfr_renamed_112.cfr_renamed_12347(arg0);
        if (byArray == null) {
            return true;
        }
        try {
            byte[] byArray2 = this.cfr_renamed_15336(arg1);
            return !spraco.cfr_renamed_1110(byArray, byArray2);
        }
        catch (spredo spredo2) {
            throw new spredo(sprlhz.cfr_renamed_9("O.S{I2P>\u001d>O)R)\u001c"));
        }
    }

    public sprtsn cfr_renamed_8155() {
        return this.cfr_renamed_86;
    }

    private /* synthetic */ void cfr_renamed_1391() {
        sprtsn sprtsn2 = this;
        sprtsn sprtsn3 = this;
        sprtsn3.cfr_renamed_152 = new sprtyo<String, sprnco>(7);
        sprtsn3.cfr_renamed_2 = new sprtyo(5);
        sprtsn2.cfr_renamed_112 = new sprtyo(7);
        sprtsn2.cfr_renamed_1 = new sprtyo<String, byte[]>(7);
        sprtsn2.cfr_renamed_4 = null;
    }

    public sprnco cfr_renamed_15337(String arg0) throws Exception {
        if (sprriia.cfr_renamed_15321(arg0 = this.cfr_renamed_15247(arg0), null) || arg0.length() == 0) {
            throw new IllegalArgumentException(sprkwe.cfr_renamed_9("\u65c7\u4eea\u544d\u4e11\u80bd\u4e26\u7a3a"));
        }
        sprnco sprnco2 = null;
        if (this.cfr_renamed_152.cfr_renamed_12143(arg0)) {
            sprnco2 = this.cfr_renamed_152.cfr_renamed_12347(arg0);
        }
        if (sprnco2 == null) {
            spreen spreen2 = this.cfr_renamed_15324(arg0);
            if (spreen2 == null) {
                return null;
            }
            sprtsn sprtsn2 = this;
            sprnco2 = sprtsn2.cfr_renamed_119.cfr_renamed_15319(spreen2);
            sprtsn2.cfr_renamed_112.cfr_renamed_13301(arg0, this.cfr_renamed_15336(sprnco2));
            sprtsn2.cfr_renamed_152.cfr_renamed_13301(arg0, sprnco2);
        }
        return sprnco2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_722() {
        try {
            this.cfr_renamed_119.cfr_renamed_722();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private /* synthetic */ byte[] cfr_renamed_15338(byte[] arg0) {
        if (this.cfr_renamed_4 == null) {
            sprtsn sprtsn2 = this;
            sprtsn2.cfr_renamed_4 = new sprudl();
        }
        return sprsfp.cfr_renamed_15339(this.cfr_renamed_4, arg0);
    }

    public String cfr_renamed_15248() {
        return this.cfr_renamed_0;
    }

    public sprlgo cfr_renamed_15340() {
        if (this.cfr_renamed_8155() == this) {
            sprlgo sprlgo2 = new sprlgo("/");
            return sprlgo2;
        }
        sprlgo sprlgo3 = this.cfr_renamed_8155().cfr_renamed_15340().cfr_renamed_15341(this.cfr_renamed_91);
        return sprlgo3;
    }

    public sprtq<String, byte[]> cfr_renamed_14727() {
        return new sprtyo<String, byte[]>(this.cfr_renamed_1);
    }

    public String cfr_renamed_15342() {
        return this.cfr_renamed_86.cfr_renamed_15248();
    }

    public String cfr_renamed_15247(String arg0) {
        sprtsn sprtsn2 = this;
        String string = sprtsn2.cfr_renamed_15327(sprtsn2.cfr_renamed_15248());
        if (sprraia.cfr_renamed_12280(string)) {
            return arg0;
        }
        return new StringBuilder().insert(0, string).append('/').append(arg0).toString();
    }

    public String cfr_renamed_15327(String arg0) {
        sprtsn sprtsn2 = this.cfr_renamed_8155();
        String string = "";
        sprtsn sprtsn3 = sprtsn2;
        while (sprtsn3 != null) {
            String string2 = "".equals(sprtsn2.cfr_renamed_0) ? "" : new StringBuilder().insert(0, sprtsn2.cfr_renamed_0).append('/').toString();
            string = new StringBuilder().insert(0, string2).append(string).toString();
            sprtsn3 = sprtsn2.cfr_renamed_8155();
        }
        return new StringBuilder().insert(0, string).append(arg0).toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ byte[] cfr_renamed_15336(sprnco arg0) throws Exception {
        try {
            sprtsn sprtsn2 = this;
            byte[] byArray = sprtsn2.cfr_renamed_119.cfr_renamed_15312(arg0);
            return sprtsn2.cfr_renamed_15338(byArray);
        }
        catch (sprwdda sprwdda2) {
            throw new Exception(sprlhz.cfr_renamed_9("\u65ba\u6838\u8b9c\u7bcc\u6465\u89da\u8ffa\u7a50\u4e10\u5f59\u5e05"), sprwdda2);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcxz;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgim;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprkdm;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlcm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsem;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtdm;
import com.spire.presentation.packages.sprtxc;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprxd;
import com.spire.presentation.packages.sprxjm;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class sprxmg
implements sprxd {
    private Set cfr_renamed_102;
    private Set cfr_renamed_93;
    private Set cfr_renamed_86;
    private Set cfr_renamed_152;
    private Set cfr_renamed_112;
    private Set cfr_renamed_119;
    private Set cfr_renamed_91;
    private Set cfr_renamed_0;
    private Set cfr_renamed_1;
    private Set cfr_renamed_2;
    private Set cfr_renamed_3;
    private Set cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_7342(Set arg0, sprgim arg1) throws sprlcm {
        if (arg0.isEmpty()) {
            return;
        }
        Iterator iterator = arg0.iterator();
        while (iterator.hasNext()) {
            sprgim sprgim2 = sprgim.cfr_renamed_23(iterator.next());
            if (!this.cfr_renamed_7343(arg1, sprgim2)) continue;
            throw new sprlcm(sprtxc.cfr_renamed_9("g<@-Z\u0006I%MhA;\b.Z'EhI&\b-P+D=L-Lh[=J<Z-Mf"));
        }
    }

    private /* synthetic */ boolean cfr_renamed_2269(Collection arg0, Collection arg1) {
        if (arg0 == arg1) {
            return true;
        }
        if (arg0 == null || arg1 == null) {
            return false;
        }
        if (arg0.size() != arg1.size()) {
            return false;
        }
        for (Object e : arg0) {
            boolean bl;
            block5: {
                Iterator iterator = arg1.iterator();
                boolean bl2 = false;
                while (iterator.hasNext()) {
                    Object e2 = iterator.next();
                    if (!this.cfr_renamed_2253(e, e2)) continue;
                    bl = bl2 = true;
                    break block5;
                }
                bl = bl2;
            }
            if (bl) continue;
            return false;
        }
        return true;
    }

    private /* synthetic */ String cfr_renamed_7344(sprigm arg0) {
        return sprupm.cfr_renamed_23(arg0.cfr_renamed_313()).cfr_renamed_314();
    }

    private /* synthetic */ Set cfr_renamed_2233(Set arg0, Set arg1) {
        HashSet<String> hashSet = new HashSet<String>();
        Iterator iterator = arg1.iterator();
        while (iterator.hasNext()) {
            String string = this.cfr_renamed_7344(((sprsem)iterator.next()).cfr_renamed_2229());
            if (arg0 == null) {
                if (string == null) continue;
                hashSet.add(string);
                continue;
            }
            Iterator iterator2 = arg0.iterator();
            while (iterator2.hasNext()) {
                Iterator iterator3;
                String string2 = (String)iterator3.next();
                iterator2 = iterator3;
                this.cfr_renamed_2225(string2, string, hashSet);
            }
        }
        return hashSet;
    }

    private /* synthetic */ boolean cfr_renamed_2265(String arg0, String arg1) {
        String string = arg0;
        String string2 = string.substring(string.indexOf(64) + 1);
        if (arg1.indexOf(64) != -1) {
            if (arg0.equalsIgnoreCase(arg1)) {
                return true;
            }
            if (string2.equalsIgnoreCase(arg1.substring(1))) {
                return true;
            }
        } else if (arg1.charAt(0) != '.' ? string2.equalsIgnoreCase(arg1) : this.cfr_renamed_2226(string2, arg1)) {
            return true;
        }
        return false;
    }

    private /* synthetic */ void cfr_renamed_2270(Set arg0, String arg1) throws sprlcm {
        if (arg0 == null) {
            return;
        }
        for (String string : arg0) {
            if (!this.cfr_renamed_2265(arg1, string)) continue;
            return;
        }
        if (arg1.length() == 0 && arg0.size() == 0) {
            return;
        }
        throw new sprlcm(sprcxz.cfr_renamed_9("@cq|vug6v{r\u007f\u007f6rrwdve`6ze3x|b3pay~6r6csa{zbgsw6`cqbasv8"));
    }

    private /* synthetic */ void cfr_renamed_2257(Set arg0, String arg1) throws sprlcm {
        if (arg0.isEmpty()) {
            return;
        }
        for (String string : arg0) {
            if (!this.cfr_renamed_2265(arg1, string)) continue;
            throw new sprlcm(sprtxc.cfr_renamed_9("m%I!DhI,L:M;[hA;\b.Z'EhI&\b-P+D=L-Lh[=J<Z-Mf"));
        }
    }

    private /* synthetic */ void cfr_renamed_2243(String arg0, String arg1, Set arg2) {
        if (arg0.indexOf(64) != -1) {
            String string = arg0;
            String string2 = string.substring(string.indexOf(64) + 1);
            if (arg1.indexOf(64) != -1) {
                if (arg0.equalsIgnoreCase(arg1)) {
                    arg2.add(arg0);
                    return;
                }
            } else if (arg1.startsWith(".")) {
                if (this.cfr_renamed_2226(string2, arg1)) {
                    arg2.add(arg0);
                    return;
                }
            } else if (string2.equalsIgnoreCase(arg1)) {
                arg2.add(arg0);
                return;
            }
        } else if (arg0.startsWith(".")) {
            if (arg1.indexOf(64) != -1) {
                String string = arg1.substring(arg0.indexOf(64) + 1);
                if (this.cfr_renamed_2226(string, arg0)) {
                    arg2.add(arg1);
                    return;
                }
            } else if (arg1.startsWith(".")) {
                if (this.cfr_renamed_2226(arg0, arg1) || arg0.equalsIgnoreCase(arg1)) {
                    arg2.add(arg0);
                    return;
                }
                if (this.cfr_renamed_2226(arg1, arg0)) {
                    arg2.add(arg1);
                    return;
                }
            } else if (this.cfr_renamed_2226(arg1, arg0)) {
                arg2.add(arg1);
                return;
            }
        } else if (arg1.indexOf(64) != -1) {
            String string = arg1;
            String string3 = string.substring(string.indexOf(64) + 1);
            if (string3.equalsIgnoreCase(arg0)) {
                arg2.add(arg1);
                return;
            }
        } else if (arg1.startsWith(".")) {
            if (this.cfr_renamed_2226(arg0, arg1)) {
                arg2.add(arg0);
                return;
            }
        } else if (arg0.equalsIgnoreCase(arg1)) {
            arg2.add(arg0);
        }
    }

    private static /* synthetic */ String cfr_renamed_2245(String arg0) {
        String string = arg0;
        String string2 = string.substring(string.indexOf(58) + 1);
        if (string2.indexOf(sprcxz.cfr_renamed_9("<9")) != -1) {
            String string3 = string2;
            string2 = string3.substring(string3.indexOf(sprtxc.cfr_renamed_9("\u0007g")) + 2);
        }
        if (string2.lastIndexOf(58) != -1) {
            String string4 = string2;
            string2 = string4.substring(0, string4.lastIndexOf(58));
        }
        String string5 = string2;
        string2 = string5.substring(string5.indexOf(58) + 1);
        if ((string2 = string2.substring(string2.indexOf(64) + 1)).indexOf(47) != -1) {
            String string6 = string2;
            string2 = string6.substring(0, string6.indexOf(47));
        }
        return string2;
    }

    private /* synthetic */ boolean cfr_renamed_2226(String arg0, String arg1) {
        int n;
        String string = arg1;
        if (string.startsWith(".")) {
            string = string.substring(1);
        }
        String[] stringArray = sprkoe.cfr_renamed_434(string, '.');
        String[] stringArray2 = sprkoe.cfr_renamed_434(arg0, '.');
        if (stringArray2.length <= stringArray.length) {
            return false;
        }
        int n2 = stringArray2.length - stringArray.length;
        int n3 = n = -1;
        while (n3 < stringArray.length) {
            if (n == -1 ? stringArray2[n + n2].equals("") : !stringArray[n].equalsIgnoreCase(stringArray2[n + n2])) {
                return false;
            }
            n3 = ++n;
        }
        return true;
    }

    private /* synthetic */ Set cfr_renamed_2232(Set arg0, Set arg1) {
        HashSet<sprszm> hashSet = new HashSet<sprszm>();
        Iterator iterator = arg1.iterator();
        while (iterator.hasNext()) {
            sprszm sprszm2 = sprszm.cfr_renamed_23(((sprsem)iterator.next()).cfr_renamed_2229().cfr_renamed_313().cfr_renamed_119());
            if (arg0 == null) {
                if (sprszm2 == null) continue;
                hashSet.add(sprszm2);
                continue;
            }
            for (sprszm sprszm3 : arg0) {
                if (sprxmg.cfr_renamed_7345(sprszm2, sprszm3)) {
                    hashSet.add(sprszm2);
                    continue;
                }
                if (!sprxmg.cfr_renamed_7345(sprszm3, sprszm2)) continue;
                hashSet.add(sprszm3);
            }
        }
        return hashSet;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        sprxmg sprxmg2 = this;
        sprxmg2.cfr_renamed_7346(stringBuilder, sprcxz.cfr_renamed_9("csa{zbgsw,"));
        if (sprxmg2.cfr_renamed_3 != null) {
            sprxmg sprxmg3 = this;
            sprxmg3.cfr_renamed_7346(stringBuilder, sprtxc.cfr_renamed_9("\ffr"));
            sprxmg3.cfr_renamed_7346(stringBuilder, sprxmg3.cfr_renamed_3.toString());
        }
        if (this.cfr_renamed_102 != null) {
            sprxmg sprxmg4 = this;
            sprxmg4.cfr_renamed_7346(stringBuilder, sprcxz.cfr_renamed_9("WX@,"));
            sprxmg4.cfr_renamed_7346(stringBuilder, sprxmg4.cfr_renamed_102.toString());
        }
        if (this.cfr_renamed_119 != null) {
            sprxmg sprxmg5 = this;
            sprxmg5.cfr_renamed_7346(stringBuilder, sprtxc.cfr_renamed_9("m%I!Dr"));
            sprxmg5.cfr_renamed_7346(stringBuilder, sprxmg5.cfr_renamed_119.toString());
        }
        if (this.cfr_renamed_2 != null) {
            sprxmg sprxmg6 = this;
            sprxmg6.cfr_renamed_7346(stringBuilder, sprcxz.cfr_renamed_9("FDZ,"));
            sprxmg6.cfr_renamed_7346(stringBuilder, sprxmg6.cfr_renamed_2.toString());
        }
        if (this.cfr_renamed_86 != null) {
            sprxmg sprxmg7 = this;
            sprxmg7.cfr_renamed_7346(stringBuilder, sprtxc.cfr_renamed_9("\u0001xr"));
            sprxmg7.cfr_renamed_7346(stringBuilder, sprxmg7.cfr_renamed_2266(this.cfr_renamed_86));
        }
        if (this.cfr_renamed_93 != null) {
            sprxmg sprxmg8 = this;
            sprxmg8.cfr_renamed_7346(stringBuilder, sprcxz.cfr_renamed_9("\\b{saXr{v,"));
            sprxmg8.cfr_renamed_7346(stringBuilder, sprxmg8.cfr_renamed_7347(this.cfr_renamed_93));
        }
        sprxmg sprxmg9 = this;
        sprxmg9.cfr_renamed_7346(stringBuilder, sprtxc.cfr_renamed_9("-P+D=L-Lr"));
        if (!sprxmg9.cfr_renamed_152.isEmpty()) {
            sprxmg sprxmg10 = this;
            sprxmg10.cfr_renamed_7346(stringBuilder, sprcxz.cfr_renamed_9("R],"));
            sprxmg10.cfr_renamed_7346(stringBuilder, sprxmg10.cfr_renamed_152.toString());
        }
        if (!this.cfr_renamed_112.isEmpty()) {
            sprxmg sprxmg11 = this;
            sprxmg11.cfr_renamed_7346(stringBuilder, sprtxc.cfr_renamed_9("l\u0006{r"));
            sprxmg11.cfr_renamed_7346(stringBuilder, sprxmg11.cfr_renamed_112.toString());
        }
        if (!this.cfr_renamed_4.isEmpty()) {
            sprxmg sprxmg12 = this;
            sprxmg12.cfr_renamed_7346(stringBuilder, sprcxz.cfr_renamed_9("V{r\u007f\u007f,"));
            sprxmg12.cfr_renamed_7346(stringBuilder, sprxmg12.cfr_renamed_4.toString());
        }
        if (!this.cfr_renamed_0.isEmpty()) {
            sprxmg sprxmg13 = this;
            sprxmg13.cfr_renamed_7346(stringBuilder, sprtxc.cfr_renamed_9("}\u001aar"));
            sprxmg13.cfr_renamed_7346(stringBuilder, sprxmg13.cfr_renamed_0.toString());
        }
        if (!this.cfr_renamed_1.isEmpty()) {
            sprxmg sprxmg14 = this;
            sprxmg14.cfr_renamed_7346(stringBuilder, sprcxz.cfr_renamed_9("_C,"));
            sprxmg14.cfr_renamed_7346(stringBuilder, sprxmg14.cfr_renamed_2266(this.cfr_renamed_1));
        }
        if (!this.cfr_renamed_91.isEmpty()) {
            sprxmg sprxmg15 = this;
            sprxmg15.cfr_renamed_7346(stringBuilder, sprtxc.cfr_renamed_9("g<@-Z\u0006I%Mr"));
            sprxmg15.cfr_renamed_7346(stringBuilder, sprxmg15.cfr_renamed_7347(this.cfr_renamed_91));
        }
        return stringBuilder.toString();
    }

    private /* synthetic */ Set cfr_renamed_2231(Set arg0, Set arg1) {
        HashSet<String> hashSet = new HashSet<String>();
        Iterator iterator = arg1.iterator();
        while (iterator.hasNext()) {
            String string = this.cfr_renamed_7344(((sprsem)iterator.next()).cfr_renamed_2229());
            if (arg0 == null) {
                if (string == null) continue;
                hashSet.add(string);
                continue;
            }
            for (String string2 : arg0) {
                if (this.cfr_renamed_2226(string2, string)) {
                    hashSet.add(string2);
                    continue;
                }
                if (!this.cfr_renamed_2226(string, string2)) continue;
                hashSet.add(string);
            }
        }
        return hashSet;
    }

    private /* synthetic */ String cfr_renamed_2236(byte[] arg0) {
        int n;
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = n2 = 0;
        while (n3 < arg0.length / 2) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(".");
            }
            byte by = arg0[n2];
            stringBuilder.append(Integer.toString(by & 0xFF));
            n3 = ++n2;
        }
        stringBuilder.append("/");
        n2 = 1;
        int n4 = n = arg0.length / 2;
        while (n4 < arg0.length) {
            StringBuilder stringBuilder2;
            if (n2 != 0) {
                n2 = 0;
                stringBuilder2 = stringBuilder;
            } else {
                StringBuilder stringBuilder3 = stringBuilder;
                stringBuilder2 = stringBuilder3;
                stringBuilder3.append(".");
            }
            byte by = arg0[n];
            stringBuilder2.append(Integer.toString(by & 0xFF));
            n4 = ++n;
        }
        return stringBuilder.toString();
    }

    private static /* synthetic */ boolean cfr_renamed_7345(sprszm arg0, sprszm arg1) {
        sprszm sprszm2;
        sprxjm sprxjm2;
        int n;
        int n2;
        block10: {
            if (arg1.cfr_renamed_84() < 1) {
                return false;
            }
            if (arg1.cfr_renamed_84() > arg0.cfr_renamed_84()) {
                return false;
            }
            n2 = 0;
            sprxjm sprxjm3 = sprxjm.cfr_renamed_23(arg1.cfr_renamed_85(0));
            int n3 = n = 0;
            while (n3 < arg0.cfr_renamed_84()) {
                n2 = n;
                sprxjm2 = sprxjm.cfr_renamed_23(arg0.cfr_renamed_85(n));
                if (sprxjm2.equals(sprxjm3)) {
                    sprszm2 = arg1;
                    break block10;
                }
                n3 = ++n;
            }
            sprszm2 = arg1;
        }
        if (sprszm2.cfr_renamed_84() > arg0.cfr_renamed_84() - n2) {
            return false;
        }
        int n4 = n = 0;
        while (n4 < arg1.cfr_renamed_84()) {
            sprxjm2 = sprxjm.cfr_renamed_23(arg1.cfr_renamed_85(n));
            sprxjm sprxjm4 = sprxjm.cfr_renamed_23(arg0.cfr_renamed_85(n2 + n));
            if (sprxjm2.cfr_renamed_84() == sprxjm4.cfr_renamed_84()) {
                if (!sprxjm2.cfr_renamed_4541().cfr_renamed_324().cfr_renamed_5078(sprxjm4.cfr_renamed_4541().cfr_renamed_324())) {
                    return false;
                }
                if (sprxjm2.cfr_renamed_84() == 1 && sprxjm2.cfr_renamed_4541().cfr_renamed_324().cfr_renamed_5078(sprkdm.cfr_renamed_102) ? !sprxjm4.cfr_renamed_4541().cfr_renamed_97().toString().startsWith(sprxjm2.cfr_renamed_4541().cfr_renamed_97().toString()) : !sprtdm.cfr_renamed_7348(sprxjm2, sprxjm4)) {
                    return false;
                }
            } else {
                return false;
            }
            n4 = ++n;
        }
        return true;
    }

    private /* synthetic */ void cfr_renamed_2259(Set arg0, byte[] arg1) throws sprlcm {
        if (arg0.isEmpty()) {
            return;
        }
        for (byte[] byArray : arg0) {
            if (!this.cfr_renamed_2249(arg1, byArray)) continue;
            throw new sprlcm(sprcxz.cfr_renamed_9("_C6ze3pay~6rx3sku\u007fcwsw6`cqbasv8"));
        }
    }

    private /* synthetic */ void cfr_renamed_7349(Set arg0, sprgim arg1) throws sprlcm {
        if (arg0 == null) {
            return;
        }
        for (sprgim sprgim2 : arg0) {
            if (!this.cfr_renamed_7343(arg1, sprgim2)) continue;
            return;
        }
        throw new sprlcm(sprtxc.cfr_renamed_9("{=J\"M+\\hg<@-Z\u0006I%MhA;\b&G<\b.Z'EhIhX-Z%A<\\-Lh[=J<Z-Mf"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ String cfr_renamed_7347(Set arg0) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Iterator iterator = arg0.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                StringBuilder stringBuilder2 = stringBuilder;
                stringBuilder2.append("]");
                return stringBuilder2.toString();
            }
            if (stringBuilder.length() > 1) {
                stringBuilder.append(",");
            }
            sprgim sprgim2 = sprgim.cfr_renamed_23(iterator.next());
            stringBuilder.append(sprgim2.cfr_renamed_7350().cfr_renamed_19());
            stringBuilder.append(":");
            try {
                stringBuilder.append(sprfqe.cfr_renamed_503(sprgim2.cfr_renamed_97().cfr_renamed_119().cfr_renamed_91()));
            }
            catch (IOException iOException) {
                stringBuilder.append(iOException.toString());
                continue;
            }
            break;
        }
    }

    @Override
    public void cfr_renamed_5068(sprigm arg0) throws sprlcm {
        switch (arg0.cfr_renamed_312()) {
            case 0: {
                sprxmg sprxmg2 = this;
                while (false) {
                }
                sprxmg2.cfr_renamed_7349(sprxmg2.cfr_renamed_93, sprgim.cfr_renamed_23(arg0.cfr_renamed_313()));
                return;
            }
            case 1: {
                sprxmg sprxmg3 = this;
                sprxmg3.cfr_renamed_2270(sprxmg3.cfr_renamed_119, this.cfr_renamed_7344(arg0));
                return;
            }
            case 2: {
                sprxmg sprxmg4 = this;
                sprxmg4.cfr_renamed_2261(sprxmg4.cfr_renamed_102, sprupm.cfr_renamed_23(arg0.cfr_renamed_313()).cfr_renamed_314());
                return;
            }
            case 4: {
                this.cfr_renamed_7266(sprnbm.cfr_renamed_23(arg0.cfr_renamed_313()));
                return;
            }
            case 6: {
                sprxmg sprxmg5 = this;
                sprxmg5.cfr_renamed_2271(sprxmg5.cfr_renamed_2, sprupm.cfr_renamed_23(arg0.cfr_renamed_313()).cfr_renamed_314());
                return;
            }
            case 7: {
                byte[] byArray = sproug.cfr_renamed_23(arg0.cfr_renamed_313()).cfr_renamed_186();
                sprxmg sprxmg6 = this;
                sprxmg6.cfr_renamed_2263(sprxmg6.cfr_renamed_86, byArray);
                return;
            }
        }
    }

    private /* synthetic */ byte[] cfr_renamed_2260(byte[] arg0, byte[] arg1) {
        int n = arg0.length;
        byte[] byArray = new byte[n * 2];
        System.arraycopy(arg0, 0, byArray, 0, n);
        int n2 = n;
        System.arraycopy(arg1, 0, byArray, n2, n2);
        return byArray;
    }

    private /* synthetic */ Set cfr_renamed_2255(Set arg0, String arg1) {
        Iterator iterator;
        if (arg0.isEmpty()) {
            if (arg1 == null) {
                return arg0;
            }
            Set set = arg0;
            set.add(arg1);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            String string = (String)iterator.next();
            iterator2 = iterator;
            this.cfr_renamed_2256(string, arg1, hashSet);
        }
        return hashSet;
    }

    private /* synthetic */ void cfr_renamed_2263(Set arg0, byte[] arg1) throws sprlcm {
        if (arg0 == null) {
            return;
        }
        for (byte[] byArray : arg0) {
            if (!this.cfr_renamed_2249(arg1, byArray)) continue;
            return;
        }
        if (arg1.length == 0 && arg0.size() == 0) {
            return;
        }
        throw new sprlcm(sprcxz.cfr_renamed_9("_C6ze3x|b3pay~6r6csa{zbgsw6`cqbasv8"));
    }

    public void cfr_renamed_7265(sprnbm arg0) throws sprlcm {
        sprxmg sprxmg2 = this;
        sprxmg2.cfr_renamed_7351(sprxmg2.cfr_renamed_152, sprszm.cfr_renamed_23(arg0));
    }

    private final /* synthetic */ void cfr_renamed_7346(StringBuilder arg0, String arg1) {
        arg0.append(arg1).append(sprkoe.cfr_renamed_5114());
    }

    private /* synthetic */ void cfr_renamed_7352(Set arg0, sprszm arg1) throws sprlcm {
        if (arg0 == null) {
            return;
        }
        if (arg0.isEmpty() && arg1.cfr_renamed_84() == 0) {
            return;
        }
        for (sprszm sprszm2 : arg0) {
            if (!sprxmg.cfr_renamed_7345(arg1, sprszm2)) continue;
            return;
        }
        throw new sprlcm(sprtxc.cfr_renamed_9("{=J\"M+\\hL![<A&O=A;@-LhF)E-\b![hF'\\hN:G%\b)\b8M:E!\\<M,\b;]*\\:M-"));
    }

    private /* synthetic */ Set cfr_renamed_2252(Set arg0, byte[] arg1) {
        Iterator iterator;
        if (arg0.isEmpty()) {
            if (arg1 == null) {
                return arg0;
            }
            Set set = arg0;
            set.add(arg1);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            byte[] byArray = (byte[])iterator.next();
            iterator2 = iterator;
            hashSet.addAll(this.cfr_renamed_2251(byArray, arg1));
        }
        return hashSet;
    }

    public int hashCode() {
        sprxmg sprxmg2 = this;
        sprxmg sprxmg3 = this;
        sprxmg sprxmg4 = this;
        sprxmg sprxmg5 = this;
        sprxmg sprxmg6 = this;
        sprxmg sprxmg7 = this;
        sprxmg sprxmg8 = this;
        sprxmg sprxmg9 = this;
        sprxmg sprxmg10 = this;
        sprxmg sprxmg11 = this;
        sprxmg sprxmg12 = this;
        sprxmg sprxmg13 = this;
        return sprxmg2.cfr_renamed_2228(sprxmg2.cfr_renamed_152) + sprxmg3.cfr_renamed_2228(sprxmg3.cfr_renamed_112) + sprxmg4.cfr_renamed_2228(sprxmg4.cfr_renamed_4) + sprxmg5.cfr_renamed_2228(sprxmg5.cfr_renamed_1) + sprxmg6.cfr_renamed_2228(sprxmg6.cfr_renamed_0) + sprxmg7.cfr_renamed_2228(sprxmg7.cfr_renamed_91) + sprxmg8.cfr_renamed_2228(sprxmg8.cfr_renamed_3) + sprxmg9.cfr_renamed_2228(sprxmg9.cfr_renamed_102) + sprxmg10.cfr_renamed_2228(sprxmg10.cfr_renamed_119) + sprxmg11.cfr_renamed_2228(sprxmg11.cfr_renamed_86) + sprxmg12.cfr_renamed_2228(sprxmg12.cfr_renamed_2) + sprxmg13.cfr_renamed_2228(sprxmg13.cfr_renamed_93);
    }

    private /* synthetic */ Set cfr_renamed_7353(Set arg0, sprszm arg1) {
        if (arg0.isEmpty()) {
            if (arg1 == null) {
                return arg0;
            }
            Set set = arg0;
            set.add(arg1);
            return set;
        }
        HashSet<sprszm> hashSet = new HashSet<sprszm>();
        for (sprszm sprszm2 : arg0) {
            if (sprxmg.cfr_renamed_7345(arg1, sprszm2)) {
                hashSet.add(sprszm2);
                continue;
            }
            HashSet<sprszm> hashSet2 = hashSet;
            if (sprxmg.cfr_renamed_7345(sprszm2, arg1)) {
                hashSet2.add(arg1);
                continue;
            }
            hashSet2.add(sprszm2);
            hashSet.add(arg1);
        }
        return hashSet;
    }

    private /* synthetic */ boolean cfr_renamed_2244(String arg0, String arg1) {
        String string = sprxmg.cfr_renamed_2245(arg0);
        return !arg1.startsWith(".") ? string.equalsIgnoreCase(arg1) : this.cfr_renamed_2226(string, arg1);
    }

    public sprxmg() {
        sprxmg sprxmg2 = this;
        this.cfr_renamed_152 = new HashSet();
        sprxmg2.cfr_renamed_112 = new HashSet();
        this.cfr_renamed_4 = new HashSet();
        this.cfr_renamed_0 = new HashSet();
        this.cfr_renamed_1 = new HashSet();
        this.cfr_renamed_91 = new HashSet();
    }

    private /* synthetic */ Set cfr_renamed_2251(byte[] arg0, byte[] arg1) {
        HashSet<byte[]> hashSet = new HashSet<byte[]>();
        if (sproze.cfr_renamed_92(arg0, arg1)) {
            HashSet<byte[]> hashSet2 = hashSet;
            hashSet2.add(arg0);
            return hashSet2;
        }
        HashSet<byte[]> hashSet3 = hashSet;
        hashSet3.add(arg0);
        hashSet.add(arg1);
        return hashSet3;
    }

    private /* synthetic */ void cfr_renamed_7351(Set arg0, sprszm arg1) throws sprlcm {
        if (arg0.isEmpty()) {
            return;
        }
        for (sprszm sprszm2 : arg0) {
            if (!sprxmg.cfr_renamed_7345(arg1, sprszm2)) continue;
            throw new sprlcm(sprcxz.cfr_renamed_9("@cq|vug6w\u007f`bzxtcze{sw6}w~s3\u007f`6ud|{3w}6vnpzfrvr3eftgdvs"));
        }
    }

    private static /* synthetic */ byte[] cfr_renamed_2250(byte[] arg0, byte[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            if ((arg0[n] & 0xFFFF) < (arg1[n] & 0xFFFF)) {
                return arg0;
            }
            n2 = ++n;
        }
        return arg1;
    }

    public void cfr_renamed_7266(sprnbm arg0) throws sprlcm {
        sprxmg sprxmg2 = this;
        sprxmg2.cfr_renamed_7352(sprxmg2.cfr_renamed_3, sprszm.cfr_renamed_23(arg0.cfr_renamed_119()));
    }

    private /* synthetic */ byte[][] cfr_renamed_2224(byte[] arg0, byte[] arg1) {
        int n = arg0.length / 2;
        byte[] byArray = new byte[n];
        byte[] byArray2 = new byte[n];
        int n2 = n;
        System.arraycopy(arg0, 0, byArray, 0, n);
        System.arraycopy(arg0, n2, byArray2, 0, n);
        byte[] byArray3 = new byte[n2];
        byte[] byArray4 = new byte[n];
        System.arraycopy(arg1, 0, byArray3, 0, n);
        System.arraycopy(arg1, n, byArray4, 0, n);
        byte[][] byArrayArray = new byte[4][];
        byArrayArray[0] = byArray;
        byArrayArray[1] = byArray2;
        byArrayArray[2] = byArray3;
        byArrayArray[3] = byArray4;
        return byArrayArray;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprxmg)) {
            return false;
        }
        sprxmg sprxmg2 = (sprxmg)arg0;
        sprxmg sprxmg3 = this;
        if (sprxmg3.cfr_renamed_2269(sprxmg2.cfr_renamed_152, sprxmg3.cfr_renamed_152)) {
            sprxmg sprxmg4 = this;
            if (sprxmg4.cfr_renamed_2269(sprxmg2.cfr_renamed_112, sprxmg4.cfr_renamed_112)) {
                sprxmg sprxmg5 = this;
                if (sprxmg5.cfr_renamed_2269(sprxmg2.cfr_renamed_4, sprxmg5.cfr_renamed_4)) {
                    sprxmg sprxmg6 = this;
                    if (sprxmg6.cfr_renamed_2269(sprxmg2.cfr_renamed_1, sprxmg6.cfr_renamed_1)) {
                        sprxmg sprxmg7 = this;
                        if (sprxmg7.cfr_renamed_2269(sprxmg2.cfr_renamed_0, sprxmg7.cfr_renamed_0)) {
                            sprxmg sprxmg8 = this;
                            if (sprxmg8.cfr_renamed_2269(sprxmg2.cfr_renamed_91, sprxmg8.cfr_renamed_91)) {
                                sprxmg sprxmg9 = this;
                                if (sprxmg9.cfr_renamed_2269(sprxmg2.cfr_renamed_3, sprxmg9.cfr_renamed_3)) {
                                    sprxmg sprxmg10 = this;
                                    if (sprxmg10.cfr_renamed_2269(sprxmg2.cfr_renamed_102, sprxmg10.cfr_renamed_102)) {
                                        sprxmg sprxmg11 = this;
                                        if (sprxmg11.cfr_renamed_2269(sprxmg2.cfr_renamed_119, sprxmg11.cfr_renamed_119)) {
                                            sprxmg sprxmg12 = this;
                                            if (sprxmg12.cfr_renamed_2269(sprxmg2.cfr_renamed_86, sprxmg12.cfr_renamed_86)) {
                                                sprxmg sprxmg13 = this;
                                                if (sprxmg13.cfr_renamed_2269(sprxmg2.cfr_renamed_2, sprxmg13.cfr_renamed_2)) {
                                                    sprxmg sprxmg14 = this;
                                                    if (sprxmg14.cfr_renamed_2269(sprxmg2.cfr_renamed_93, sprxmg14.cfr_renamed_93)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private /* synthetic */ void cfr_renamed_2225(String arg0, String arg1, Set arg2) {
        if (arg0.indexOf(64) != -1) {
            String string = arg0;
            String string2 = string.substring(string.indexOf(64) + 1);
            if (arg1.indexOf(64) != -1) {
                if (arg0.equalsIgnoreCase(arg1)) {
                    arg2.add(arg0);
                    return;
                }
            } else if (arg1.startsWith(".")) {
                if (this.cfr_renamed_2226(string2, arg1)) {
                    arg2.add(arg0);
                    return;
                }
            } else if (string2.equalsIgnoreCase(arg1)) {
                arg2.add(arg0);
                return;
            }
        } else if (arg0.startsWith(".")) {
            if (arg1.indexOf(64) != -1) {
                String string = arg1.substring(arg0.indexOf(64) + 1);
                if (this.cfr_renamed_2226(string, arg0)) {
                    arg2.add(arg1);
                    return;
                }
            } else if (arg1.startsWith(".")) {
                if (this.cfr_renamed_2226(arg0, arg1) || arg0.equalsIgnoreCase(arg1)) {
                    arg2.add(arg0);
                    return;
                }
                if (this.cfr_renamed_2226(arg1, arg0)) {
                    arg2.add(arg1);
                    return;
                }
            } else if (this.cfr_renamed_2226(arg1, arg0)) {
                arg2.add(arg1);
                return;
            }
        } else if (arg1.indexOf(64) != -1) {
            String string = arg1;
            String string3 = string.substring(string.indexOf(64) + 1);
            if (string3.equalsIgnoreCase(arg0)) {
                arg2.add(arg1);
                return;
            }
        } else if (arg1.startsWith(".")) {
            if (this.cfr_renamed_2226(arg0, arg1)) {
                arg2.add(arg0);
                return;
            }
        } else if (arg0.equalsIgnoreCase(arg1)) {
            arg2.add(arg0);
        }
    }

    private static /* synthetic */ byte[] cfr_renamed_2267(byte[] arg0, byte[] arg1) {
        int n;
        byte[] byArray = new byte[arg0.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n;
            byte by = (byte)(arg0[n] | arg1[n3]);
            byArray[n3] = by;
            n2 = ++n;
        }
        return byArray;
    }

    private /* synthetic */ Set cfr_renamed_7354(Set arg0, Set arg1) {
        HashSet hashSet = new HashSet(arg0);
        hashSet.retainAll(arg1);
        return hashSet;
    }

    private /* synthetic */ void cfr_renamed_2247(Set arg0, String arg1) throws sprlcm {
        if (arg0.isEmpty()) {
            return;
        }
        for (String string : arg0) {
            if (!this.cfr_renamed_2226(arg1, string) && !arg1.equalsIgnoreCase(string)) continue;
            throw new sprlcm(sprtxc.cfr_renamed_9("l\u0006{hA;\b.Z'EhI&\b-P+D=L-Lh[=J<Z-Mf"));
        }
    }

    @Override
    public void cfr_renamed_5070(sprsem[] arg0) {
        int n;
        HashMap hashMap = new HashMap();
        int n2 = n = 0;
        while (n2 != arg0.length) {
            sprsem object = arg0[n];
            Integer n3 = spruaf.cfr_renamed_279(object.cfr_renamed_2229().cfr_renamed_312());
            if (hashMap.get(n3) == null) {
                hashMap.put(n3, new HashSet());
            }
            ((Set)hashMap.get(n3)).add(object);
            n2 = ++n;
        }
        block9: for (Map.Entry entry : hashMap.entrySet()) {
            int n4 = (Integer)entry.getKey();
            switch (n4) {
                case 0: {
                    sprxmg sprxmg2 = this;
                    while (false) {
                    }
                    sprxmg2.cfr_renamed_93 = sprxmg2.cfr_renamed_7354(sprxmg2.cfr_renamed_93, (Set)entry.getValue());
                    continue block9;
                }
                case 1: {
                    sprxmg sprxmg3 = this;
                    sprxmg3.cfr_renamed_119 = sprxmg3.cfr_renamed_2230(sprxmg3.cfr_renamed_119, (Set)entry.getValue());
                    continue block9;
                }
                case 2: {
                    sprxmg sprxmg4 = this;
                    sprxmg4.cfr_renamed_102 = sprxmg4.cfr_renamed_2231(sprxmg4.cfr_renamed_102, (Set)entry.getValue());
                    continue block9;
                }
                case 4: {
                    sprxmg sprxmg5 = this;
                    sprxmg5.cfr_renamed_3 = sprxmg5.cfr_renamed_2232(sprxmg5.cfr_renamed_3, (Set)entry.getValue());
                    continue block9;
                }
                case 6: {
                    sprxmg sprxmg6 = this;
                    sprxmg6.cfr_renamed_2 = sprxmg6.cfr_renamed_2233(sprxmg6.cfr_renamed_2, (Set)entry.getValue());
                    continue block9;
                }
                case 7: {
                    sprxmg sprxmg7 = this;
                    sprxmg7.cfr_renamed_86 = sprxmg7.cfr_renamed_2234(sprxmg7.cfr_renamed_86, (Set)entry.getValue());
                    continue block9;
                }
            }
            throw new IllegalStateException(new StringBuilder().insert(0, sprcxz.cfr_renamed_9("C}}}ydx3brq3s}u|c}bvdvr)6")).append(n4).toString());
        }
    }

    private /* synthetic */ Set cfr_renamed_2234(Set arg0, Set arg1) {
        HashSet<byte[]> hashSet = new HashSet<byte[]>();
        Iterator iterator = arg1.iterator();
        while (iterator.hasNext()) {
            byte[] byArray = sproug.cfr_renamed_23(((sprsem)iterator.next()).cfr_renamed_2229().cfr_renamed_313()).cfr_renamed_186();
            if (arg0 == null) {
                if (byArray == null) continue;
                hashSet.add(byArray);
                continue;
            }
            Iterator iterator2 = arg0.iterator();
            while (iterator2.hasNext()) {
                Iterator iterator3;
                byte[] byArray2 = (byte[])iterator3.next();
                iterator2 = iterator3;
                hashSet.addAll(this.cfr_renamed_2237(byArray2, byArray));
            }
        }
        return hashSet;
    }

    @Override
    public void cfr_renamed_7264(sprsem arg0) {
        sprsem[] sprsemArray = new sprsem[1];
        sprsemArray[0] = arg0;
        this.cfr_renamed_5070(sprsemArray);
    }

    private /* synthetic */ Set cfr_renamed_2230(Set arg0, Set arg1) {
        HashSet<String> hashSet = new HashSet<String>();
        Iterator iterator = arg1.iterator();
        while (iterator.hasNext()) {
            String string = this.cfr_renamed_7344(((sprsem)iterator.next()).cfr_renamed_2229());
            if (arg0 == null) {
                if (string == null) continue;
                hashSet.add(string);
                continue;
            }
            Iterator iterator2 = arg0.iterator();
            while (iterator2.hasNext()) {
                Iterator iterator3;
                String string2 = (String)iterator3.next();
                iterator2 = iterator3;
                this.cfr_renamed_2243(string, string2, hashSet);
            }
        }
        return hashSet;
    }

    private /* synthetic */ String cfr_renamed_2266(Set arg0) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Iterator iterator = arg0.iterator();
        Iterator iterator2 = iterator;
        while (iterator2.hasNext()) {
            if (stringBuilder.length() > 1) {
                stringBuilder.append(",");
            }
            stringBuilder.append(this.cfr_renamed_2236((byte[])iterator.next()));
            iterator2 = iterator;
        }
        StringBuilder stringBuilder2 = stringBuilder;
        stringBuilder2.append("]");
        return stringBuilder2.toString();
    }

    private /* synthetic */ void cfr_renamed_2258(Set arg0, String arg1) throws sprlcm {
        if (arg0.isEmpty()) {
            return;
        }
        for (String string : arg0) {
            if (!this.cfr_renamed_2244(arg1, string)) continue;
            throw new sprlcm(sprtxc.cfr_renamed_9("}\u001aahA;\b.Z'EhI&\b-P+D=L-Lh[=J<Z-Mf"));
        }
    }

    private /* synthetic */ void cfr_renamed_2240(String arg0, String arg1, Set arg2) {
        if (arg0.indexOf(64) != -1) {
            String string = arg0;
            String string2 = string.substring(string.indexOf(64) + 1);
            if (arg1.indexOf(64) != -1) {
                if (arg0.equalsIgnoreCase(arg1)) {
                    arg2.add(arg0);
                    return;
                }
                arg2.add(arg0);
                arg2.add(arg1);
                return;
            }
            if (arg1.startsWith(".")) {
                Set set = arg2;
                if (this.cfr_renamed_2226(string2, arg1)) {
                    set.add(arg1);
                    return;
                }
                set.add(arg0);
                arg2.add(arg1);
                return;
            }
            Set set = arg2;
            if (string2.equalsIgnoreCase(arg1)) {
                set.add(arg1);
                return;
            }
            set.add(arg0);
            arg2.add(arg1);
            return;
        }
        if (arg0.startsWith(".")) {
            if (arg1.indexOf(64) != -1) {
                String string = arg1.substring(arg0.indexOf(64) + 1);
                Set set = arg2;
                if (this.cfr_renamed_2226(string, arg0)) {
                    set.add(arg0);
                    return;
                }
                set.add(arg0);
                arg2.add(arg1);
                return;
            }
            if (arg1.startsWith(".")) {
                if (this.cfr_renamed_2226(arg0, arg1) || arg0.equalsIgnoreCase(arg1)) {
                    arg2.add(arg1);
                    return;
                }
                Set set = arg2;
                if (this.cfr_renamed_2226(arg1, arg0)) {
                    set.add(arg0);
                    return;
                }
                set.add(arg0);
                arg2.add(arg1);
                return;
            }
            Set set = arg2;
            if (this.cfr_renamed_2226(arg1, arg0)) {
                set.add(arg0);
                return;
            }
            set.add(arg0);
            arg2.add(arg1);
            return;
        }
        if (arg1.indexOf(64) != -1) {
            String string = arg1.substring(arg0.indexOf(64) + 1);
            Set set = arg2;
            if (string.equalsIgnoreCase(arg0)) {
                set.add(arg0);
                return;
            }
            set.add(arg0);
            arg2.add(arg1);
            return;
        }
        if (arg1.startsWith(".")) {
            Set set = arg2;
            if (this.cfr_renamed_2226(arg0, arg1)) {
                set.add(arg1);
                return;
            }
            set.add(arg0);
            arg2.add(arg1);
            return;
        }
        Set set = arg2;
        if (arg0.equalsIgnoreCase(arg1)) {
            set.add(arg0);
            return;
        }
        set.add(arg0);
        arg2.add(arg1);
    }

    private /* synthetic */ int cfr_renamed_2228(Collection arg0) {
        if (arg0 == null) {
            return 0;
        }
        int n = 0;
        for (Object e : arg0) {
            if (e instanceof byte[]) {
                n += sproze.cfr_renamed_95((byte[])e);
                continue;
            }
            n += e.hashCode();
        }
        return n;
    }

    private /* synthetic */ boolean cfr_renamed_2253(Object arg0, Object arg1) {
        if (arg0 == arg1) {
            return true;
        }
        if (arg0 == null || arg1 == null) {
            return false;
        }
        if (arg0 instanceof byte[] && arg1 instanceof byte[]) {
            return sproze.cfr_renamed_92((byte[])arg0, (byte[])arg1);
        }
        return arg0.equals(arg1);
    }

    private /* synthetic */ void cfr_renamed_2256(String arg0, String arg1, Set arg2) {
        if (arg0.indexOf(64) != -1) {
            String string = arg0;
            String string2 = string.substring(string.indexOf(64) + 1);
            if (arg1.indexOf(64) != -1) {
                if (arg0.equalsIgnoreCase(arg1)) {
                    arg2.add(arg0);
                    return;
                }
                arg2.add(arg0);
                arg2.add(arg1);
                return;
            }
            if (arg1.startsWith(".")) {
                Set set = arg2;
                if (this.cfr_renamed_2226(string2, arg1)) {
                    set.add(arg1);
                    return;
                }
                set.add(arg0);
                arg2.add(arg1);
                return;
            }
            Set set = arg2;
            if (string2.equalsIgnoreCase(arg1)) {
                set.add(arg1);
                return;
            }
            set.add(arg0);
            arg2.add(arg1);
            return;
        }
        if (arg0.startsWith(".")) {
            if (arg1.indexOf(64) != -1) {
                String string = arg1.substring(arg0.indexOf(64) + 1);
                Set set = arg2;
                if (this.cfr_renamed_2226(string, arg0)) {
                    set.add(arg0);
                    return;
                }
                set.add(arg0);
                arg2.add(arg1);
                return;
            }
            if (arg1.startsWith(".")) {
                if (this.cfr_renamed_2226(arg0, arg1) || arg0.equalsIgnoreCase(arg1)) {
                    arg2.add(arg1);
                    return;
                }
                Set set = arg2;
                if (this.cfr_renamed_2226(arg1, arg0)) {
                    set.add(arg0);
                    return;
                }
                set.add(arg0);
                arg2.add(arg1);
                return;
            }
            Set set = arg2;
            if (this.cfr_renamed_2226(arg1, arg0)) {
                set.add(arg0);
                return;
            }
            set.add(arg0);
            arg2.add(arg1);
            return;
        }
        if (arg1.indexOf(64) != -1) {
            String string = arg1.substring(arg0.indexOf(64) + 1);
            Set set = arg2;
            if (string.equalsIgnoreCase(arg0)) {
                set.add(arg0);
                return;
            }
            set.add(arg0);
            arg2.add(arg1);
            return;
        }
        if (arg1.startsWith(".")) {
            Set set = arg2;
            if (this.cfr_renamed_2226(arg0, arg1)) {
                set.add(arg1);
                return;
            }
            set.add(arg0);
            arg2.add(arg1);
            return;
        }
        Set set = arg2;
        if (arg0.equalsIgnoreCase(arg1)) {
            set.add(arg0);
            return;
        }
        set.add(arg0);
        arg2.add(arg1);
    }

    private /* synthetic */ Set cfr_renamed_2237(byte[] arg0, byte[] arg1) {
        if (arg0.length != arg1.length) {
            return Collections.EMPTY_SET;
        }
        sprxmg sprxmg2 = this;
        byte[][] byArray = sprxmg2.cfr_renamed_2224(arg0, arg1);
        byte[] byArray2 = byArray[0];
        byte[] byArray3 = byArray[1];
        byte[] byArray4 = byArray[2];
        byte[] byArray5 = byArray[3];
        byte[][] byArray6 = sprxmg2.cfr_renamed_2246(byArray2, byArray3, byArray4, byArray5);
        byte[] byArray7 = sprxmg.cfr_renamed_2250(byArray6[1], byArray6[3]);
        if (sprxmg.cfr_renamed_2254(sprxmg.cfr_renamed_2227(byArray6[0], byArray6[2]), byArray7) == 1) {
            return Collections.EMPTY_SET;
        }
        byte[] byArray8 = sprxmg.cfr_renamed_2267(byArray6[0], byArray6[2]);
        byte[] byArray9 = sprxmg.cfr_renamed_2267(byArray3, byArray5);
        return Collections.singleton(this.cfr_renamed_2260(byArray8, byArray9));
    }

    private /* synthetic */ Set cfr_renamed_2268(Set arg0, String arg1) {
        if (arg0.isEmpty()) {
            if (arg1 == null) {
                return arg0;
            }
            Set set = arg0;
            set.add(arg1);
            return set;
        }
        HashSet<String> hashSet = new HashSet<String>();
        for (String string : arg0) {
            if (this.cfr_renamed_2226(string, arg1)) {
                hashSet.add(arg1);
                continue;
            }
            HashSet<String> hashSet2 = hashSet;
            if (this.cfr_renamed_2226(arg1, string)) {
                hashSet2.add(string);
                continue;
            }
            hashSet2.add(string);
            hashSet.add(arg1);
        }
        return hashSet;
    }

    private static /* synthetic */ int cfr_renamed_2254(byte[] arg0, byte[] arg1) {
        if (sproze.cfr_renamed_92(arg0, arg1)) {
            return 0;
        }
        if (sproze.cfr_renamed_92(sprxmg.cfr_renamed_2227(arg0, arg1), arg0)) {
            return 1;
        }
        return -1;
    }

    private static /* synthetic */ byte[] cfr_renamed_2227(byte[] arg0, byte[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            if ((arg0[n] & 0xFFFF) > (arg1[n] & 0xFFFF)) {
                return arg0;
            }
            n2 = ++n;
        }
        return arg1;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void cfr_renamed_2238(int arg0) {
        switch (arg0) {
            case 0: {
                this.cfr_renamed_93 = new HashSet();
                return;
            }
            case 1: {
                this.cfr_renamed_119 = new HashSet();
                return;
            }
            case 2: {
                this.cfr_renamed_102 = new HashSet();
                return;
            }
            case 4: {
                this.cfr_renamed_3 = new HashSet();
                return;
            }
            case 6: {
                this.cfr_renamed_2 = new HashSet();
                return;
            }
            case 7: {
                this.cfr_renamed_86 = new HashSet();
                return;
            }
        }
        throw new IllegalStateException(new StringBuilder().insert(0, sprcxz.cfr_renamed_9("C}}}ydx3brq3s}u|c}bvdvr)6")).append(arg0).toString());
    }

    private /* synthetic */ boolean cfr_renamed_7343(sprgim arg0, sprgim arg1) {
        return arg1.equals(arg0);
    }

    private /* synthetic */ void cfr_renamed_2261(Set arg0, String arg1) throws sprlcm {
        if (arg0 == null) {
            return;
        }
        for (String string : arg0) {
            if (!this.cfr_renamed_2226(arg1, string) && !arg1.equalsIgnoreCase(string)) continue;
            return;
        }
        if (arg1.length() == 0 && arg0.size() == 0) {
            return;
        }
        throw new sprlcm(sprtxc.cfr_renamed_9("l\u0006{hA;\b&G<\b.Z'EhIhX-Z%A<\\-Lh[=J<Z-Mf"));
    }

    private /* synthetic */ void cfr_renamed_2271(Set arg0, String arg1) throws sprlcm {
        if (arg0 == null) {
            return;
        }
        for (String string : arg0) {
            if (!this.cfr_renamed_2244(arg1, string)) continue;
            return;
        }
        if (arg1.length() == 0 && arg0.size() == 0) {
            return;
        }
        throw new sprlcm(sprcxz.cfr_renamed_9("FDZ6ze3x|b3pay~6r6csa{zbgsw6`cqbasv8"));
    }

    private /* synthetic */ byte[][] cfr_renamed_2246(byte[] arg0, byte[] arg1, byte[] arg2, byte[] arg3) {
        int n;
        int n2 = arg0.length;
        byte[] byArray = new byte[n2];
        byte[] byArray2 = new byte[n2];
        byte[] byArray3 = new byte[n2];
        byte[] byArray4 = new byte[n2];
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = n;
            byArray[n4] = (byte)(arg0[n] & arg1[n4]);
            int n5 = n;
            byArray2[n5] = (byte)(arg0[n] & arg1[n5] | ~arg1[n]);
            int n6 = n;
            byArray3[n6] = (byte)(arg2[n] & arg3[n6]);
            int n7 = n;
            byte by = (byte)(arg2[n] & arg3[n7] | ~arg3[n]);
            byArray4[n7] = by;
            n3 = ++n;
        }
        byte[][] byArrayArray = new byte[4][];
        byArrayArray[0] = byArray;
        byArrayArray[1] = byArray2;
        byArrayArray[2] = byArray3;
        byArrayArray[3] = byArray4;
        return byArrayArray;
    }

    private /* synthetic */ boolean cfr_renamed_2249(byte[] arg0, byte[] arg1) {
        int n;
        int n2 = arg0.length;
        if (n2 != arg1.length / 2) {
            return false;
        }
        byte[] byArray = new byte[n2];
        int n3 = n2;
        System.arraycopy(arg1, n3, byArray, 0, n2);
        byte[] byArray2 = new byte[n3];
        byte[] byArray3 = new byte[n2];
        int n4 = n = 0;
        while (n4 < n2) {
            int n5 = n;
            byArray2[n5] = (byte)(arg1[n] & byArray[n5]);
            int n6 = n;
            byte by = (byte)(arg0[n] & byArray[n6]);
            byArray3[n6] = by;
            n4 = ++n;
        }
        return sproze.cfr_renamed_92(byArray2, byArray3);
    }

    private /* synthetic */ Set cfr_renamed_2239(Set arg0, String arg1) {
        Iterator iterator;
        if (arg0.isEmpty()) {
            if (arg1 == null) {
                return arg0;
            }
            Set set = arg0;
            set.add(arg1);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            String string = (String)iterator.next();
            iterator2 = iterator;
            this.cfr_renamed_2240(string, arg1, hashSet);
        }
        return hashSet;
    }

    @Override
    public void cfr_renamed_5071(sprsem arg0) {
        sprigm sprigm2 = arg0.cfr_renamed_2229();
        switch (sprigm2.cfr_renamed_312()) {
            case 0: {
                sprxmg sprxmg2 = this;
                while (false) {
                }
                sprxmg2.cfr_renamed_91 = sprxmg2.cfr_renamed_7355(sprxmg2.cfr_renamed_91, sprgim.cfr_renamed_23(sprigm2.cfr_renamed_313()));
                return;
            }
            case 1: {
                sprxmg sprxmg3 = this;
                this.cfr_renamed_4 = sprxmg3.cfr_renamed_2239(this.cfr_renamed_4, sprxmg3.cfr_renamed_7344(sprigm2));
                return;
            }
            case 2: {
                sprxmg sprxmg4 = this;
                this.cfr_renamed_112 = sprxmg4.cfr_renamed_2268(this.cfr_renamed_112, sprxmg4.cfr_renamed_7344(sprigm2));
                return;
            }
            case 4: {
                sprxmg sprxmg5 = this;
                sprxmg5.cfr_renamed_152 = sprxmg5.cfr_renamed_7353(sprxmg5.cfr_renamed_152, (sprszm)sprigm2.cfr_renamed_313().cfr_renamed_119());
                return;
            }
            case 6: {
                sprxmg sprxmg6 = this;
                this.cfr_renamed_0 = sprxmg6.cfr_renamed_2255(this.cfr_renamed_0, sprxmg6.cfr_renamed_7344(sprigm2));
                return;
            }
            case 7: {
                sprxmg sprxmg7 = this;
                sprxmg7.cfr_renamed_1 = sprxmg7.cfr_renamed_2252(sprxmg7.cfr_renamed_1, sproug.cfr_renamed_23(sprigm2.cfr_renamed_313()).cfr_renamed_186());
                return;
            }
        }
        throw new IllegalStateException(new StringBuilder().insert(0, sprtxc.cfr_renamed_9("\u001dF#F'_&\b<I/\b-F+G=F<M:M,\u0012h")).append(sprigm2.cfr_renamed_312()).toString());
    }

    private /* synthetic */ Set cfr_renamed_7355(Set arg0, sprgim arg1) {
        HashSet<sprgim> hashSet = new HashSet<sprgim>(arg0);
        hashSet.add(arg1);
        return hashSet;
    }

    @Override
    public void cfr_renamed_5069(sprigm arg0) throws sprlcm {
        switch (arg0.cfr_renamed_312()) {
            case 0: {
                sprxmg sprxmg2 = this;
                while (false) {
                }
                sprxmg2.cfr_renamed_7342(sprxmg2.cfr_renamed_91, sprgim.cfr_renamed_23(arg0.cfr_renamed_313()));
                return;
            }
            case 1: {
                sprxmg sprxmg3 = this;
                sprxmg3.cfr_renamed_2257(sprxmg3.cfr_renamed_4, this.cfr_renamed_7344(arg0));
                return;
            }
            case 2: {
                sprxmg sprxmg4 = this;
                sprxmg4.cfr_renamed_2247(sprxmg4.cfr_renamed_112, sprupm.cfr_renamed_23(arg0.cfr_renamed_313()).cfr_renamed_314());
                return;
            }
            case 4: {
                this.cfr_renamed_7265(sprnbm.cfr_renamed_23(arg0.cfr_renamed_313()));
                return;
            }
            case 6: {
                sprxmg sprxmg5 = this;
                sprxmg5.cfr_renamed_2258(sprxmg5.cfr_renamed_0, sprupm.cfr_renamed_23(arg0.cfr_renamed_313()).cfr_renamed_314());
                return;
            }
            case 7: {
                byte[] byArray = sproug.cfr_renamed_23(arg0.cfr_renamed_313()).cfr_renamed_186();
                sprxmg sprxmg6 = this;
                sprxmg6.cfr_renamed_2259(sprxmg6.cfr_renamed_1, byArray);
                return;
            }
        }
    }
}


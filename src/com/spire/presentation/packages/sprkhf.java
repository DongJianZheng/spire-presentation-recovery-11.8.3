/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahf;
import com.spire.presentation.packages.spraws;
import com.spire.presentation.packages.sprbff;
import com.spire.presentation.packages.spregf;
import com.spire.presentation.packages.spren;
import com.spire.presentation.packages.sprfbf;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprjze;
import com.spire.presentation.packages.sprkfz;
import com.spire.presentation.packages.sprkgf;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprodf;
import com.spire.presentation.packages.sprohf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpye;
import com.spire.presentation.packages.sprqgf;
import com.spire.presentation.packages.sprrgm;
import com.spire.presentation.packages.sprri;
import com.spire.presentation.packages.sprtxe;
import com.spire.presentation.packages.sprtyl;
import com.spire.presentation.packages.spruef;
import com.spire.presentation.packages.sprzhm;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class sprkhf {
    private sprri cfr_renamed_1;
    private List<spren> cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private final sprjj cfr_renamed_4;

    public sprfbf cfr_renamed_5350(spregf arg0, BigInteger arg1) throws sprahf, IOException {
        sprkhf sprkhf2 = this;
        sprqgf[] sprqgfArray = sprkhf2.cfr_renamed_5365();
        byte[] byArray = sprkhf2.cfr_renamed_1.cfr_renamed_3217(this.cfr_renamed_4, sprqgfArray);
        return arg0.cfr_renamed_5306(this.cfr_renamed_4.cfr_renamed_615(), byArray, arg1);
    }

    public sprbff cfr_renamed_5346(sprjze arg0) throws sprahf, spruef {
        sprqgf[] sprqgfArray = this.cfr_renamed_5365();
        if (sprqgfArray.length != 1) {
            throw new spruef(spraws.cfr_renamed_9("L<M=H9M,\u0001;D-T*D-\u0001!@:IiU;D,RiG&T'E"));
        }
        sprkhf sprkhf2 = this;
        byte[] byArray = sprkhf2.cfr_renamed_1.cfr_renamed_3217(sprkhf2.cfr_renamed_4, sprqgfArray);
        if (arg0.cfr_renamed_648() != 0) {
            throw new sprahf(new StringBuilder().insert(0, sprkfz.cfr_renamed_9("\fx\b\u000b*N+[7E+NxN*Y7YxX,J,^+\u0011x")).append(arg0.cfr_renamed_647()).toString());
        }
        sprzhm sprzhm2 = arg0.cfr_renamed_652().cfr_renamed_577().cfr_renamed_568();
        if (!sprzhm2.cfr_renamed_592().cfr_renamed_579().equals(this.cfr_renamed_4.cfr_renamed_615())) {
            throw new spruef(spraws.cfr_renamed_9("=H$DiR=@$QiH$Q;H'UiG&SiV;N'Fi@%F&S U!L"));
        }
        if (!sproze.cfr_renamed_92(sprzhm2.cfr_renamed_592().cfr_renamed_595(), byArray)) {
            throw new spruef(sprkfz.cfr_renamed_9("_1F=\u000b+_9F(\u000b1F(Y1E,\u000b>D*\u000b/Y7E?\u000b*D7_xC9X0"));
        }
        if (sprqgfArray[0].cfr_renamed_5366() == 1) {
            return new sprbff(new sprrgm(null, null, arg0.cfr_renamed_652().cfr_renamed_637().cfr_renamed_568()), this.cfr_renamed_4);
        }
        return new sprbff(new sprrgm(this.cfr_renamed_4.cfr_renamed_615(), sprqgfArray, arg0.cfr_renamed_652().cfr_renamed_637().cfr_renamed_568()), this.cfr_renamed_4);
    }

    public void cfr_renamed_5367(List<spren> arg0) {
        this.cfr_renamed_2.addAll(arg0);
    }

    public void cfr_renamed_5344(sprtyl arg0) throws IOException {
        sprkhf sprkhf2 = this;
        OutputStream outputStream = sprkhf2.cfr_renamed_4.cfr_renamed_470();
        outputStream.write(arg0.cfr_renamed_104("DER"));
        outputStream.close();
        sprkhf2.cfr_renamed_3 = sprkhf2.cfr_renamed_4.cfr_renamed_580();
    }

    public List<sprbff> cfr_renamed_5368(sprjze arg0) throws sprahf, spruef {
        int n;
        sprkhf sprkhf2 = this;
        sprqgf[] sprqgfArray = sprkhf2.cfr_renamed_5365();
        byte[] byArray = sprkhf2.cfr_renamed_1.cfr_renamed_3217(this.cfr_renamed_4, sprqgfArray);
        if (arg0.cfr_renamed_648() != 0) {
            throw new sprahf(new StringBuilder().insert(0, spraws.cfr_renamed_9("u\u001aqiS,R9N'R,\u0001,S;N;\u0001:U(U<Rs\u0001")).append(arg0.cfr_renamed_647()).toString());
        }
        sprzhm sprzhm2 = arg0.cfr_renamed_652().cfr_renamed_577().cfr_renamed_568();
        if (!sprzhm2.cfr_renamed_592().cfr_renamed_579().equals(this.cfr_renamed_4.cfr_renamed_615())) {
            throw new spruef(sprkfz.cfr_renamed_9("_1F=\u000b+_9F(\u000b1F(Y1E,\u000b>D*\u000b/Y7E?\u000b9G?D*B,C5"));
        }
        if (!sproze.cfr_renamed_92(sprzhm2.cfr_renamed_592().cfr_renamed_595(), byArray)) {
            throw new spruef(spraws.cfr_renamed_9("=H$DiR=@$QiH$Q;H'UiG&SiV;N'FiS&N=\u0001!@:I"));
        }
        sprlvm sprlvm2 = arg0.cfr_renamed_652().cfr_renamed_637().cfr_renamed_568();
        ArrayList<sprbff> arrayList = new ArrayList<sprbff>();
        if (sprqgfArray.length == 1 && sprqgfArray[0].cfr_renamed_5366() == 1) {
            ArrayList<sprbff> arrayList2 = arrayList;
            arrayList2.add(new sprbff(new sprrgm(null, null, sprlvm2), this.cfr_renamed_4));
            return arrayList2;
        }
        sprbff[] sprbffArray = new sprbff[sprqgfArray.length];
        int n2 = n = 0;
        while (n2 != sprqgfArray.length) {
            sprkhf sprkhf3 = this;
            sprqgf[] sprqgfArray2 = sprkhf3.cfr_renamed_1.cfr_renamed_5327(sprkhf3.cfr_renamed_4, sprqgfArray[n], n);
            sprbffArray[((sprkgf)sprqgfArray[++n]).cfr_renamed_4] = new sprbff(new sprrgm(this.cfr_renamed_4.cfr_renamed_615(), sprqgfArray2, sprlvm2), this.cfr_renamed_4);
            n2 = n;
        }
        int n3 = n = 0;
        while (n3 != sprqgfArray.length) {
            arrayList.add(sprbffArray[n++]);
            n3 = n;
        }
        return arrayList;
    }

    public sprfbf cfr_renamed_5369(spregf arg0) throws sprahf, IOException {
        sprkhf sprkhf2 = this;
        sprqgf[] sprqgfArray = sprkhf2.cfr_renamed_5365();
        byte[] byArray = sprkhf2.cfr_renamed_1.cfr_renamed_3217(this.cfr_renamed_4, sprqgfArray);
        return arg0.cfr_renamed_5308(this.cfr_renamed_4.cfr_renamed_615(), byArray);
    }

    public sprkhf(sprjj sprjj2) {
        sprkhf sprkhf2 = this;
        sprkhf sprkhf3 = this;
        sprkhf2.cfr_renamed_2 = new ArrayList<spren>();
        sprkhf2.cfr_renamed_1 = new sprtxe();
        sprkhf2.cfr_renamed_4 = sprjj2;
    }

    private /* synthetic */ sprkgf[] cfr_renamed_5365() {
        int n;
        sprkhf sprkhf2 = this;
        List<sprpye> list = sprohf.cfr_renamed_5321(sprkhf2.cfr_renamed_4, sprkhf2.cfr_renamed_2, this.cfr_renamed_3);
        sprkgf[] sprkgfArray = new sprkgf[list.size()];
        HashSet<sprodf> hashSet = new HashSet<sprodf>();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_2.size()) {
            if (this.cfr_renamed_2.get(n) instanceof sprodf) {
                hashSet.add((sprodf)this.cfr_renamed_2.get(n));
            }
            n2 = ++n;
        }
        int n3 = n = 0;
        while (n3 != list.size()) {
            byte[] byArray = list.get((int)n).cfr_renamed_4;
            spren spren2 = this.cfr_renamed_2.get(list.get((int)n).cfr_renamed_3);
            if (spren2 instanceof sprodf) {
                sprkhf sprkhf3 = this;
                List<byte[]> list2 = ((sprodf)spren2).cfr_renamed_5364(sprkhf3.cfr_renamed_4, sprkhf3.cfr_renamed_3);
                List<byte[]> list3 = list2;
                sprkgfArray[n] = new sprkgf(list.get((int)n).cfr_renamed_3, (byte[][])list3.toArray((T[])new byte[list3.size()][]), null);
            } else {
                sprkgfArray[n] = new sprkgf(list.get((int)n).cfr_renamed_3, byArray, null);
            }
            n3 = ++n;
        }
        return sprkgfArray;
    }

    public void cfr_renamed_5343(spren arg0) {
        this.cfr_renamed_2.add(arg0);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spren;
import com.spire.presentation.packages.sprnica;
import com.spire.presentation.packages.sprodf;
import com.spire.presentation.packages.sprxdf;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class sprwze
extends sprodf {
    public sprwze(File arg0) throws FileNotFoundException {
        super(sprwze.cfr_renamed_5361(arg0));
    }

    public List<sprwze> cfr_renamed_5362() {
        int n;
        ArrayList<sprwze> arrayList = new ArrayList<sprwze>();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.size()) {
            if (this.cfr_renamed_4.get(n) instanceof sprwze) {
                arrayList.add((sprwze)this.cfr_renamed_4.get(n));
            }
            n2 = ++n;
        }
        return arrayList;
    }

    private static /* synthetic */ List<spren> cfr_renamed_5361(File arg0) throws FileNotFoundException {
        if (arg0.isDirectory()) {
            int n;
            File[] fileArray = arg0.listFiles();
            ArrayList<spren> arrayList = new ArrayList<spren>(fileArray.length);
            int n2 = n = 0;
            while (n2 != fileArray.length) {
                if (fileArray[n].isDirectory()) {
                    if (fileArray[n].listFiles().length != 0) {
                        arrayList.add(new sprwze(fileArray[n]));
                    }
                } else {
                    arrayList.add(new sprxdf(fileArray[n]));
                }
                n2 = ++n;
            }
            return arrayList;
        }
        throw new IllegalArgumentException(sprnica.cfr_renamed_9("D\u0014N\u0018\u0002\u000fG\u001bG\u000fG\u0013A\u0018\u0002\u0019M\u0018Q]L\u0012V]P\u0018D\u0018P]V\u0012\u0002\u0019K\u000fG\u001eV\u0012P\u0004"));
    }

    public List<sprxdf> cfr_renamed_5363() {
        int n;
        ArrayList<sprxdf> arrayList = new ArrayList<sprxdf>();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.size()) {
            if (this.cfr_renamed_4.get(n) instanceof sprxdf) {
                arrayList.add((sprxdf)this.cfr_renamed_4.get(n));
            }
            n2 = ++n;
        }
        return arrayList;
    }
}


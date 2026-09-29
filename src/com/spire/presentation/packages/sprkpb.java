/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvca;
import com.spire.presentation.packages.sprckz;
import java.security.cert.PolicyNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class sprkpb
implements PolicyNode {
    public Set cfr_renamed_119;
    public Set cfr_renamed_91;
    public String cfr_renamed_0;
    public boolean cfr_renamed_1;
    public int cfr_renamed_2;
    public List cfr_renamed_3;
    public PolicyNode cfr_renamed_4;

    public Object clone() {
        return this.cfr_renamed_461();
    }

    public Iterator getChildren() {
        return this.cfr_renamed_3.iterator();
    }

    public void cfr_renamed_335(sprkpb arg0) {
        this.cfr_renamed_3.add(arg0);
        arg0.cfr_renamed_2222(this);
    }

    @Override
    public PolicyNode getParent() {
        return this.cfr_renamed_4;
    }

    public boolean cfr_renamed_336() {
        return !this.cfr_renamed_3.isEmpty();
    }

    public void cfr_renamed_338(boolean arg0) {
        this.cfr_renamed_1 = arg0;
    }

    @Override
    public boolean isCritical() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprkpb(List list, int n, Set set, PolicyNode policyNode, Set set2, String string, boolean bl) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprkpb sprkpb2 = this;
        sprkpb sprkpb3 = this;
        sprkpb sprkpb4 = this;
        this.cfr_renamed_3 = arg0;
        sprkpb4.cfr_renamed_2 = arg1;
        sprkpb4.cfr_renamed_119 = arg2;
        sprkpb3.cfr_renamed_4 = arg3;
        sprkpb3.cfr_renamed_91 = arg4;
        sprkpb2.cfr_renamed_0 = arg5;
        sprkpb2.cfr_renamed_1 = bl;
    }

    public Set getExpectedPolicies() {
        return this.cfr_renamed_119;
    }

    @Override
    public int getDepth() {
        return this.cfr_renamed_2;
    }

    public void cfr_renamed_2215(sprkpb arg0) {
        this.cfr_renamed_3.remove(arg0);
    }

    public sprkpb cfr_renamed_461() {
        Iterator iterator;
        HashSet<String> hashSet = new HashSet<String>();
        Iterator iterator2 = iterator = this.cfr_renamed_119.iterator();
        while (iterator2.hasNext()) {
            hashSet.add(new String((String)iterator.next()));
            iterator2 = iterator;
        }
        HashSet<String> hashSet2 = new HashSet<String>();
        iterator = this.cfr_renamed_91.iterator();
        Iterator iterator3 = iterator;
        while (iterator3.hasNext()) {
            hashSet2.add(new String((String)iterator.next()));
            iterator3 = iterator;
        }
        sprkpb sprkpb2 = new sprkpb(new ArrayList(), this.cfr_renamed_2, hashSet, null, hashSet2, new String(this.cfr_renamed_0), this.cfr_renamed_1);
        iterator = this.cfr_renamed_3.iterator();
        Iterator iterator4 = iterator;
        while (iterator4.hasNext()) {
            sprkpb sprkpb3 = ((sprkpb)iterator.next()).cfr_renamed_461();
            iterator4 = iterator;
            sprkpb sprkpb4 = sprkpb3;
            sprkpb sprkpb5 = sprkpb2;
            sprkpb4.cfr_renamed_2222(sprkpb5);
            sprkpb5.cfr_renamed_335(sprkpb4);
        }
        return sprkpb2;
    }

    public String cfr_renamed_2223(String arg0) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(arg0);
        stringBuffer.append(this.cfr_renamed_0);
        stringBuffer.append(sprckz.cfr_renamed_9("LGf"));
        int n = 0;
        int n2 = n;
        while (n2 < this.cfr_renamed_3.size()) {
            sprkpb sprkpb2 = (sprkpb)this.cfr_renamed_3.get(n);
            stringBuffer.append(sprkpb2.cfr_renamed_2223(new StringBuilder().insert(0, arg0).append("    ").toString()));
            n2 = ++n;
        }
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer2.append(arg0);
        stringBuffer.append(sprbvca.cfr_renamed_9("MK"));
        return stringBuffer2.toString();
    }

    public Set getPolicyQualifiers() {
        return this.cfr_renamed_91;
    }

    public String toString() {
        return this.cfr_renamed_2223("");
    }

    @Override
    public String getValidPolicy() {
        return this.cfr_renamed_0;
    }

    public void cfr_renamed_2222(sprkpb arg0) {
        this.cfr_renamed_4 = arg0;
    }
}


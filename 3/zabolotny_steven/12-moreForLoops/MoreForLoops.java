public class MoreForLoops {
    public String diag(int n) {
	String diag = "";
	for (int index = 1;index<=n;index++) {
	    for (int space = 1;space<i;space++) {
		diag = diag + " ";
	    }
	    diag = diag + "*" + "\n";
	}
	return diag;
    }

    public String diag(String n) {
	String diag = "";
	for (int index = 1;index<=n.length();index++) {
	    for (int space = 1;space<index;space++) {
		diag = diag + " ";
	    }
	    diag = diag + n.substring(index-1,index) + "\n";
	}
	return diag;
    }	

    public String fence(int h,int l) {
	String fence = "+";
	for (int height=0;height<h;h++) {
		for (int length=0;length<l;l++) {
		    if (height=0) {
			fence = fence + "-";}
		    else if (height=0 && length=l-1) {
			fence = fence + "+";}
		    else if ((height=h-1 && length=0) || (height=h-1 && length=l-1)) {
			fence = fence + "+";}
		    else if (length = 0 || length = l-1) {
			fence = fence + "|";}
		    else {
			fence = fence + "";}
		}
	}
    }		
}
	    
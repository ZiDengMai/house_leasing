package leasing.entity;

public class Reference_document {
    private String referenceDocumentId;

    private String name;

    private String description;

    private String image;

    private String file;

    public String getReferenceDocumentId() {
        return referenceDocumentId;
    }

    public void setReferenceDocumentId(String referenceDocumentId) {
        this.referenceDocumentId = referenceDocumentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", referenceDocumentId=").append(referenceDocumentId);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", image=").append(image);
        sb.append(", file=").append(file);
        sb.append("]");
        return sb.toString();
    }
}
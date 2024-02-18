package de.vepexlegit.rotationfixdebug;

public enum RotationFix {
    INSTANCE;

    private boolean enabled = true;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}

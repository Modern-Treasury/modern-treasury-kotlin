package com.moderntreasury.api.errors

class ModernTreasuryInvalidDataException(message: String? = null, cause: Throwable? = null) :
    ModernTreasuryException(message, cause)

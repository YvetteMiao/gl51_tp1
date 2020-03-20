package gl51.service

import gl51.data.Photo

interface PhotoWatermarkService {
    /**
     * Add watermark to the photo
     * @return
     */
    Photo addWatermark()
}
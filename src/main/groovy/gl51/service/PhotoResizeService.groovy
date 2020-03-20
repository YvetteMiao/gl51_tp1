package gl51.service

import gl51.data.Photo

interface PhotoResizeService {
    /**
     * The photo is resized in 1024*1024 px
     * @return
     */
    Photo resize()
}